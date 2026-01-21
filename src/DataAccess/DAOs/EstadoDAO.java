package DataAccess.DAOs;

import DataAccess.DTOs.EstadoDTO;
import DataAccess.Helpers.DataHelperSQLiteDAO;
import Infrastructure.AppException;

public class EstadoDAO extends DataHelperSQLiteDAO<EstadoDTO>{
    public EstadoDAO() throws AppException {
        super(EstadoDTO.class, "Estado", "IdEstado");
    }
}
