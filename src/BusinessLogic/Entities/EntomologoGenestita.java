package BusinessLogic.Entities;

import Infrastructure.AppException;

public class EntomologoGenestita extends Entomologo {
    public EntomologoGenestita(String usuario, String clave) throws AppException {
        eDTO = new DataAccess.DTOs.EntomologoDTO(usuario, clave);
    }
}
