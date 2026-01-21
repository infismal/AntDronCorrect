package DataAccess.DTOs;

public class EntomologoDTO {
    private Integer IdEntomologo; 
    private String Usuario      ;
    private String Clave        ;
    private String Estado       ;
    private String FechaCreacion;
    private String FechaModifica;

    public EntomologoDTO() {
    }

    public EntomologoDTO(String usuario, String clave) {
        IdEntomologo = 0;
        Usuario = usuario;
        Clave = clave;
    }

    

    public EntomologoDTO(Integer idEntomologo, String usuario, String clave, String estado, String fechaCreacion,
            String fechaModifica) {
        IdEntomologo = idEntomologo;
        Usuario = usuario;
        Clave = clave;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }
    public Integer getIdEntomologo() {
        return IdEntomologo;
    }
    public void setIdEntomologo(Integer idEntomologo) {
        IdEntomologo = idEntomologo;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String clave) {
        Clave = clave;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFechaCreacion() {
        return FechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
    public String getFechaModifica() {
        return FechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName()
        + "\n IdEntomologo  : "+ getIdEntomologo  ()
        + "\n Usuario       : "+ getUsuario       ()
        + "\n Clave         : "+ getClave         ()
        + "\n Estado        : "+ getEstado        ()
        + "\n FechaCreacion : "+ getFechaCreacion ()
        + "\n FechaModifica : "+ getFechaModifica ();
    }  
}
