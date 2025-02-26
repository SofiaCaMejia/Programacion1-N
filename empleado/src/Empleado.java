public class Empleado {
    private String nombre;
    private String puesto;
    private String identificacion;
    private String correoElectronico;
    private String fechaContratacion;
    private String numeroContacto;

    Empleado(String nombre, String puesto, String identificacion, String correoElectronico, String fechaContratacion, String NumeroContacto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
        this.fechaContratacion = fechaContratacion;
        this.numeroContacto = NumeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        numeroContacto = numeroContacto;
    }
    public String toString() {
        return "Nombre: " + nombre + "\nPuesto: " + puesto + "\nIdentificacion: " + identificacion +
                "\nCorreo: " + correoElectronico + "\nFecha de contratacion: " + fechaContratacion +
                "\nNumero de contacto: " + numeroContacto;
    }
}