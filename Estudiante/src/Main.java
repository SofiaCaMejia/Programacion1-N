import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrse la cantidad de estudiantes que requiere matricular: "));
        for (int i = 0; i < n; i++) {

            String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            String genero = JOptionPane.showInputDialog("Ingrese su genero: ");
            String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion: ");
            String alergias = JOptionPane.showInputDialog("Ingrese sus alergias: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero de contacto del acudiente: ");

            JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);
            JOptionPane.showMessageDialog(null, "Su edad es: " + edad);
            JOptionPane.showMessageDialog(null, "Su genero es: " + genero);
            JOptionPane.showMessageDialog(null, "Su identificacion es: " + identificacion);
            JOptionPane.showMessageDialog(null, "Sus alergias son: " + alergias);
            JOptionPane.showMessageDialog(null, "El nombre del acudiente es: " + nombreAcudiente);
            JOptionPane.showMessageDialog(null, "El numero de contacto del acudiente es: " + numeroAcudiente);

            Estudiante estudiante = new Estudiante(nombre, edad, genero, identificacion, alergias, nombreAcudiente, numeroAcudiente);
            JOptionPane.showMessageDialog(null, estudiante);

        }
    }
}