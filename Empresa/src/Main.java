import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = null;

        while (true) {
            String menu = "===== Menú Principal =====\n"
                    + "1. Registrar Empresa\n"
                    + "2. Agregar Empleado\n"
                    + "3. Mostrar Empleados\n"
                    + "4. Calcular Nómina\n"
                    + "5. Reporte de Salarios (Máximo y Mínimo)\n"
                    + "6. Cargar Datos de Prueba\n"
                    + "7. Salir\n";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break;
            int opcion;
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    String nit = JOptionPane.showInputDialog("Ingrese el NIT de la empresa:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
                    empresa = new Empresa(nit, nombre);
                    JOptionPane.showMessageDialog(null, "Empresa registrada exitosamente.");
                    break;

                case 2:
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar una empresa.");
                    } else {
                        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                        String cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado:");

                        int anios = 0;
                        while (true) {
                            try {
                                anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años en la empresa:"));
                                if (anios < 0) {
                                    JOptionPane.showMessageDialog(null, "Los años no pueden ser negativos.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para los años.");
                            }
                        }

                        double salario = 0;
                        while (true) {
                            try {
                                salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base:"));
                                if (salario < 0) {
                                    JOptionPane.showMessageDialog(null, "El salario no puede ser negativo.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el salario.");
                            }
                        }

                        Empleado empleado = new Empleado(cedula, nombreEmpleado, cargo, anios, salario);
                        empresa.agregarEmpleado(empleado);
                    }
                    break;

                case 3:
                    if (empresa == null || empresa.getEmpleados().length == 0) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Empleado e : empresa.getEmpleados()) {
                            if (e != null) {
                                sb.append(e.toString()).append("\n");
                            }
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 4:
                    if (empresa != null) {
                        JOptionPane.showMessageDialog(null, "La nómina total es: $" + empresa.calcularNomina());
                    }
                    break;

                case 5:
                    if (empresa != null) {
                        String reporte = empresa.reporteSalarios();
                        JOptionPane.showMessageDialog(null, reporte);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar una empresa.");
                    }
                    break;

                case 6:
                    if (empresa != null) {
                        empresa.cargarDatos();
                        JOptionPane.showMessageDialog(null, "Datos de prueba cargados correctamente.");
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}
