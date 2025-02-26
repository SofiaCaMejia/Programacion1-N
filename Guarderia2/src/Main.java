import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno>listaAlumnos = new ArrayList();

        while(true){
            String opcion = JOptionPane.showInputDialog("*** OPCIONES ***\n" +
                    "*1). Añadir alumno\n" +
                    "*2). modificar alumno\n" +
                    "*3). Eliminar alumno\n" +
                    "*4). Mostrar alumno\n" );
            if(opcion.equals("1")){
                int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudiantes para añadir"));
                for(int i = 0; i < n; i++){
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del alumno"));
                    String genero = JOptionPane.showInputDialog("Ingrese el genero del alumno");
                    String id = JOptionPane.showInputDialog("Ingrese el id del alumno");
                    String alergias = JOptionPane.showInputDialog("Ingrese la alergias");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
                    String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero de acudiente");
                    Alumno alumnonuevo = new Alumno(nombre, edad,genero, id, alergias, nombreAcudiente, numeroAcudiente);
                    listaAlumnos.add(alumnonuevo);
                    JOptionPane.showInputDialog(null, "Estudiante añadido" + alumnonuevo);
                }
            }
            else if (opcion.equals("2")){
                String idModificar = JOptionPane.showInputDialog("Ingrese el id del alumno");
                for (Alumno est : listaAlumnos) {
                    if (est.getIdentificacion().equals(idModificar)){
                        est.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del alumno" ,est.getNombre()));
                        est.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del alumno",est.getEdad())));
                        est.setGenero(JOptionPane.showInputDialog("Ingrese el genero",est.getGenero()));
                        est.setAlergias(JOptionPane.showInputDialog("Ingrese el alergias",est.getAlergias()));
                        est.setNombreAcudiente(JOptionPane.showInputDialog("Ingrese el nombre del acudiente",est.getNombreAcudiente()));

                        JOptionPane.showInputDialog(null,"alumno modificado\n"+est);
                        break;

                    }
                }
            }
            else if (opcion.equals("3")){
                String idEliminar = JOptionPane.showInputDialog("Ingrese el id del alumno");
                for (Alumno est : listaAlumnos) {
                    if (est.getIdentificacion().equals(idEliminar)){
                        listaAlumnos.remove(est);
                        JOptionPane.showInputDialog(null,"alumno eliminado\n"+est);
                        break;
                    }
                }
            }
            else if (opcion.equals("4")){
                String idBuscar = JOptionPane.showInputDialog("Ingrese la identificacion del alumno");
                for (Alumno est : listaAlumnos) {
                    if (est.getIdentificacion().equals(idBuscar)){
                        JOptionPane.showMessageDialog(null,est);
                        break;
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"No se ha encontrado el alumno");
            }

        }
    }
}