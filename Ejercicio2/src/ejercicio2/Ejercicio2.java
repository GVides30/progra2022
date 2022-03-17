package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int longitud;

        longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la contraseña"));
        int respuesta1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas contraseñas desea generar?"));

        //Arrays
        Password contrasenias[] = new Password[respuesta1];
        boolean esFuerte[] = new boolean[respuesta1];

        //Mostrar contraseñas
        for (int i = 0; i < contrasenias.length; i++) {
            contrasenias[i] = new Password(longitud);

            esFuerte[i] = contrasenias[i].esFuerte();
            System.out.println(contrasenias[i].getPassword() + " Seguridad de contraseña: " + esFuerte[i]);
        }

    }
}
