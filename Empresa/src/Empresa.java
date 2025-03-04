import javax.swing.JOptionPane;

public class Empresa {
    private String nit;
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.empleados = new Empleado[50];
        this.numEmpleados = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEmpleados() {
        return numEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (numEmpleados >= 50) {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más empleados. Límite alcanzado.");
            return false;
        }

        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getCedula().equals(empleado.getCedula())) {
                JOptionPane.showMessageDialog(null, "El empleado con esta cédula ya está registrado.");
                return false;
            }
        }

        empleados[numEmpleados] = empleado;
        numEmpleados++;
        return true;
    }

    public String mostrarEmpleados() {
        if (numEmpleados == 0) {
            return "No hay empleados registrados.";
        }

        StringBuilder sb = new StringBuilder("Lista de empleados:\n");
        for (int i = 0; i < numEmpleados; i++) {
            sb.append(empleados[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcularNomina() {
        double total = 0;
        for (int i = 0; i < numEmpleados; i++) {
            total += empleados[i].ajustarSalario();
        }
        return total;
    }

    public String reporteSalarios() {
        if (numEmpleados == 0) {
            return "No hay empleados registrados.";
        }

        double maxSalario = empleados[0].ajustarSalario();
        double minSalario = empleados[0].ajustarSalario();
        Empleado empleadoMax = empleados[0];
        Empleado empleadoMin = empleados[0];

        for (int i = 1; i < numEmpleados; i++) {
            double salarioActual = empleados[i].ajustarSalario();
            if (salarioActual > maxSalario) {
                maxSalario = salarioActual;
                empleadoMax = empleados[i];
            }
            if (salarioActual < minSalario) {
                minSalario = salarioActual;
                empleadoMin = empleados[i];
            }
        }

        return "Empleado con mayor salario:\n" + empleadoMax.toString() +
                "\nEmpleado con menor salario:\n" + empleadoMin.toString();
    }

    public void cargarDatos() {
        agregarEmpleado(new Empleado("101", "Juan Pérez", "Gerente", 6, 5000));
        agregarEmpleado(new Empleado("102", "Ana Gómez", "Contadora", 2, 3000));
        agregarEmpleado(new Empleado("103", "Carlos López", "Ingeniero", 8, 4000));
        JOptionPane.showMessageDialog(null, "Datos de prueba cargados correctamente.");
    }
}
