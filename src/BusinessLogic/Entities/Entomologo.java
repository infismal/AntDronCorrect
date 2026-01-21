package BusinessLogic.Entities;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import BusinessLogic.Interfaces.IEntomologo;
import DataAccess.DAOs.EntomologoDAO;
import DataAccess.DTOs.EntomologoDTO;
import DataAccess.DTOs.HormigaDTO;
import Infrastructure.AppConfig;
import Infrastructure.AppException;
import Infrastructure.Tools.CMDColor;
import Infrastructure.Tools.CMDProgress;

public abstract class Entomologo implements IEntomologo {
    EntomologoDAO eDAO;
    EntomologoDTO eDTO;

    protected Entomologo() throws AppException {
        eDAO = new EntomologoDAO();
        eDTO = new EntomologoDTO();
    }
    
    public boolean checkLogin(String u, String p) throws AppException{
        eDTO = eDAO.readBy(u, p);
        return (eDTO.getIdEntomologo()>0);
    }
    
    private int getIdHormigaTipoByName(String name) {
        switch (name) {
            case "HLarva":       return 1;
            case "HSoldado":     return 2;
            case "HRastreadora": return 3;
            case "HReina":       return 4;
            case "HZángano":     return 5;
            default:             return 0;
        }
    }
    @Override
    public List<HormigaDTO> etlAntNest() throws AppException {
        try {
            List<HormigaDTO> lst = new java.util.ArrayList<>();
            List<String> allLines = Files.readAllLines(Paths.get(AppConfig.getANTNEST()));
            Integer dataIdHormiga     = 0 ; 
            Integer dataIdHormigaTipo = null ; 
            Integer dataIdSexo        = 4 ;  // Asexual
            Integer dataIdEstado      = 1 ;  // Viva
            String  dataNombre        = null ; 
            String  dataDescripcion   = null ;

            for (String line : allLines) {
                System.out.println(line);
                for (String data : line.split(",")) {
                    dataIdHormigaTipo = getIdHormigaTipoByName(data.trim());
                    if (dataIdHormigaTipo > 0) {
                        dataNombre          = data.trim();
                        dataDescripcion     = "Hormiga de tipo " + data.trim();
                        
                        System.out.println(   CMDColor.BLUE
                                            + CMDProgress.showSpinner() 
                                            + dataNombre 
                                            + CMDColor.RESET);
                        
                        HormigaDTO h = new HormigaDTO(  dataIdHormiga     , 
                                                        dataIdHormigaTipo , 
                                                        dataIdSexo        , 
                                                        dataIdEstado      , 
                                                        dataNombre        , 
                                                        dataDescripcion   ); 
                        lst.add( h );
                    }else{
                        System.out.println(   CMDColor.RED 
                                            + CMDProgress.showSpinner() 
                                            + data.trim() 
                                            + CMDColor.RESET);
                    }
                }
            }
            return lst;
        } catch (Exception e) {
            throw new AppException("Error leyendo el archivo de datos de hormigas: ", e, getClass(),"etlAntNest()");
        }
    }

    @Override
    public List<Alimento> etlAntFood() {
        throw new UnsupportedOperationException("Unimplemented method 'etlAntFood'");
    }

    @Override
    public Hormiga alimentarAnt(Hormiga h, Alimento a) {
        throw new UnsupportedOperationException("Unimplemented method 'alimentarAnt'");
    }
}
