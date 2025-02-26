public class Alumno {
    private String nombre;
    private int edad;
    private String genero;
    private String identificacion;
    private String alergias;
    private String nombreAcudiente;
    private final String numeroContacto;

    Alumno(String nombre, int edad, String genero, String identificacion, String alergias,
           String nombreAcudiente, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        numeroContacto = numeroContacto;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero + "\nIdentificacion: " + identificacion +
                "\nAlergias: " + alergias + "\nNombre del acudiente: " +  nombreAcudiente +
                "\nNumero del acudiente: " + numeroContacto;
    }
}