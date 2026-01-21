package DataAccess.DAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DataAccess.DTOs.AlimentoTipoDTO;
import DataAccess.Helpers.DataHelperSQLiteDAO;
import Infrastructure.AppException;

public class AlimentoTipoDAO extends DataHelperSQLiteDAO<AlimentoTipoDTO>{
    public AlimentoTipoDAO() throws AppException {
        super(AlimentoTipoDTO.class, "AlimentoTipo", "IdAlimentoTipo");
    }
      
    public AlimentoTipoDTO check (String nombre) throws AppException {
        AlimentoTipoDTO dto = new AlimentoTipoDTO();
        String query = " SELECT IdAlimentoTipo"
                      +"  ,Nombre         "   
                      +"  ,Descripcion    "     
                      +"  ,Estado       "
                      +"  ,FechaCreacion"   
                      +"  ,FechaModifica" 
                      +"  FROM AlimentoTipo WHERE Nombre = '"+ nombre + "' ";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new AlimentoTipoDTO(rs.getInt(1)          // IdAlimentoTipo
                                        ,rs.getString(2)        // Nombre            
                                        ,rs.getString(3)        // Descripcion             
                                        ,rs.getString(4)        // Estado
                                        ,rs.getString(5)        // FechaCreacion
                                        ,rs.getString(6)        // FechaModifica
                                      ); 
            }
            return dto;
        } 
        catch (SQLException e) {
            throw new AppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
    }
}

