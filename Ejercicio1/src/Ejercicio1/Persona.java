package Ejercicio1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Persona {

    private final JTextArea informacion = new JTextArea();
    private String salida = "Información de la Persona\n";
    private String Nombre, sexo = "Hombre";
    private int edad;
    private double peso, altura;

    public Persona() {
    }

    public void NomSexEdPeAl() {
        Nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        sexo = JOptionPane.showInputDialog("Ingrese el sexo: \nH: Hombre M: Mujer");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la persona"));
        salida = salida + "Nombre: \t" + Nombre + "\n";
    }

    public void NomSexEd() {
        Nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        sexo = JOptionPane.showInputDialog("Ingrese el sexo: \nH: Hombre M: Mujer");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));

        salida = salida + "Nombre: \t" + Nombre + "\n";
    }

    public void CalcularIMC() {
        int calculo;
        String funcion = "0";
        calculo = (int) (peso / Math.pow(altura, 2));
        if (calculo < 20) {
            funcion = "-1 Por debajo del peso ideal";

        } else if (calculo >= 20 && calculo <= 25) {
            funcion = "0 Peso ideal";

        } else if (calculo > 25) {
            funcion = "1 Sobrepeso";

        }
        salida = salida + "Peso ideal: \t" + funcion + "\n";
    }

    public void esMayorDeEdad() {
        boolean mayorEdad = false;
        mayorEdad = edad >= 18;
        salida = salida + "Mayor de Edad: \t" + mayorEdad + "\n";
    }

    public void comprobarSexo() {

        if (sexo.equalsIgnoreCase("h")) {
            sexo = "H";
        } else if (sexo.equalsIgnoreCase("m")) {
            sexo = "M";
        } else {
            sexo = "H";
        }
        salida = salida + "Sexo: \t" + sexo + "\n";

    }

    public void to_String() {
        informacion.setText(salida);
        JOptionPane.showMessageDialog(null, informacion);
    }

    public void generaDUI() {
        if (edad >= 18) {
            int DUI = (int) (Math.random() * 55555555 + 44444444);
            int UltimNum = (int) (Math.random() * 9);

            JOptionPane.showMessageDialog(null, "DUI: " + DUI + " - " + UltimNum);
        }
    }
}
