import java.util.ArrayList;
import java.util.List;

class Guarderia {
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public boolean agregarAlumno(Alumno alumno) {
        for (Alumno n : listaAlumnos) {
            if (n.getIdentificacion().equals(alumno.getIdentificacion())) {
                System.out.println(" Error: La Identificacion " + alumno.getIdentificacion() + " ya está en uso.");
                return false;
            }
        }
        listaAlumnos.add(alumno);
        System.out.println("Alumno agregado correctamente.");
        return true;
    }

    // Método para listar niños mayores a 5 años
    public void listarAlumnosMayoresA5() {
        System.out.println("\n Alumnos mayores a 5:");
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getEdad() > 5) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay alumnos mayores a 5.");
        }
    }


    public void listarTodosLosAlumnos() {
        System.out.println("\n Lista de todos los alumnos:");
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno alumno  : listaAlumnos) {

            }
        }
    }
}