package ejercicio1;
import modelos.Persona;
import modelos.Ciudad;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        Persona abigail = new Persona();
        abigail.setNombres("Abigail Lissette");
        abigail.setApellidos("Chavez Lainez");
        abigail.setEdad(18);
        abigail.setAltura(1.65f);

    String dato = "Nombre completo: " + abigail.getNombres() + " " +
        abigail.getApellidos() + "\nEdad: " + abigail.getEdad() + " \nALtura " +
            abigail.getAltura();

        JOptionPane.showMessageDialog(null, dato);

    Ciudad managua = new Ciudad();
    managua.setNombre("Managua");
    managua.setPoblacion(1063815);

    String datoDos = "Nombre de la ciudad: " + managua.getNombre() + "\nLa poblacion es de: " + managua.getPoblacion() + " personas ";

        JOptionPane.showMessageDialog(null, datoDos);

JOptionPane.showMessageDialog(null, managua);
    }
}
