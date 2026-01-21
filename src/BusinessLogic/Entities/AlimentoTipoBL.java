package BusinessLogic.Entities;

import java.util.ArrayList;
import java.util.List;

import DataAccess.DAOs.AlimentoTipoDAO;
import DataAccess.DTOs.AlimentoTipoDTO;
import Infrastructure.AppException;
public class AlimentoTipoBL {

    //a dao lo pongo publico para permitirle que pueda hacer cosas en las otras capas tambien, no solo aqui.

    public AlimentoTipoDAO dao = null; //Con este a la ultima capa, insertado, borradom, etc. 
    // Usaremos para todo el CRUD y los metodos adicionales que necesitemos.

    public AlimentoTipoBL() throws AppException {
        dao = new AlimentoTipoDAO();
    }

    //Si solo quiero una tabla de lectura

    // public List<AlimentoTipoDTO> getAll() throws AppException{
    //     return dao.readAll();
        
    // } //con este metodo las capas de aeriba solo pueden leer lo que este metodo trae.


}
