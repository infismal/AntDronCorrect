package BusinessLogic.Entities;

import BusinessLogic.FactoryBL;
import DataAccess.DAOs.HormigaDAO;
import DataAccess.DTOs.HormigaDTO;

public abstract class Hormiga {
    protected FactoryBL<HormigaDTO> factory = new FactoryBL<>(HormigaDAO.class);
    public HormigaDTO data = new HormigaDTO();
    AntCiberDron usaAntCiberDron = new AntCiberDron();
    
    // protected HormigaDAO hormigaDAO;
    // protected Hormiga() throws AppException  {
    //     this.hormigaDAO = new HormigaDAO();
    // }

    // public FactoryBL<HormigaDTO> factory = new FactoryBL<>(() -> {
    //     try {
    //         return new HormigaDAO();
    //     } catch (Exception e) {
    //         new RuntimeException();
    //     }
    // });
}
