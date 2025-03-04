public class Empleado {
    private String nombre;
    private String cedula;
    private String cargo;
    private int aniosEmpresa;
    private double salario;

    public Empleado(String nombre, String cedula, String cargo, int aniosEmpresa, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cargo = cargo;
        this.aniosEmpresa = aniosEmpresa;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getAniosEmpresa() {
        return aniosEmpresa;
    }

    public void setAniosEmpresa(int aniosEmpresa) {
        this.aniosEmpresa = aniosEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double ajustarSalario() {
        if (aniosEmpresa > 10) {
            salario *= 1.15;
        } else if (aniosEmpresa > 5) {
            salario *= 1.10;
        } else if (aniosEmpresa > 3) {
            salario *= 1.05;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " | Cédula: " + cedula + " | Cargo: " + cargo +
                " | Años en la empresa: " + aniosEmpresa + " | Salario: " + salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Cargo: " + cargo);
        System.out.println("Años en la empresa: " + aniosEmpresa);
        System.out.println("Salario: " + salario);
    }
}
