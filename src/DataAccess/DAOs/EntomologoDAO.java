package DataAccess.DAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DataAccess.DTOs.EntomologoDTO;
import DataAccess.Helpers.DataHelperSQLiteDAO;
import Infrastructure.AppException;

public class EntomologoDAO extends DataHelperSQLiteDAO<EntomologoDTO>{
    public EntomologoDAO() throws AppException {
        super(EntomologoDTO.class, "Entomologo", "IdEntomologo");
    }

    
    public EntomologoDTO readBy( String usuario, String clave) throws AppException {
        EntomologoDTO dto = new EntomologoDTO();
        String query = " SELECT IdEntomologo"
                      +"  ,Usuario       "
                      +"  ,Clave  "
                      +"  ,Estado       "
                      +"  ,FechaCreacion"   
                      +"  ,FechaModifica" 
                      +"  FROM Entomologo WHERE Usuario = '" + usuario + "' AND Clave = '" + clave + "'";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new EntomologoDTO(rs.getInt(1)            // IdEntomologo
                                        ,rs.getString(2)        // Usuario            
                                        ,rs.getString(3)        // Clave        
                                        ,rs.getString(4)        // Estado
                                        ,rs.getString(5)        // FechaCreacion
                                        ,rs.getString(6)        // FechaModifica
                                      ); 
            }
        } 
        catch (SQLException e) {
            throw new AppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
        return dto;
    }

}
