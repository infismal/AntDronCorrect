package DataAccess.DTOs;

public class EstadoDTO {
    private Integer IdEstado;     
    private String  Nombre;       
    private String  Descripcion;  
    private String  Estado;       
    private String  FechaCreacion;
    private String  FechaModifica;


    public EstadoDTO() {
    }

    public EstadoDTO(String nombre, String descripcion) {
        IdEstado = 0;
        Nombre = nombre;
        Descripcion = descripcion;
    }
    
    public EstadoDTO(Integer idEstado, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdEstado = idEstado;
        Nombre = nombre;
        Descripcion = descripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getIdEstado() {
        return IdEstado;
    }
    public void setIdEstado(Integer idEstado) {
        IdEstado = idEstado;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
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
   public String toString(){
        return getClass().getName()
        + "\n IdEstado      : "+ getIdEstado      ()
        + "\n Nombre        : "+ getNombre        ()
        + "\n Descripcion   : "+ getDescripcion   ()
        + "\n Estado        : "+ getEstado        ()
        + "\n FechaCreacion : "+ getFechaCreacion ()
        + "\n FechaModifica : "+ getFechaModifica ();
    }
}
