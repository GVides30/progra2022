package Ejercicio1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Persona {

    private final JTextArea informacion = new JTextArea();
    private String salida = "Información de la Persona\n";
    private String Nombre;
    private int edad;
    private double peso, altura;
    private char sexo;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
        salida = salida + "Nombre: \t" + this.Nombre + "\n";
    }

    public void setEdad(int edad) {
        this.edad = edad;
        salida = salida + "Edad: \t" + this.edad + "\n";
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        if (this.sexo == 'h') {
            this.sexo = 'H';
        } else if (this.sexo == 'm') {
            this.sexo = 'M';
        } else {
            this.sexo = 'H';
        }
        salida = salida + "Sexo: \t" + this.sexo + "\n";
    }

    public void setPesoYAltura(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        String funcion = " ";

        int calculo = (int) (this.peso / Math.pow(this.altura, 2));
        if (calculo < 20) {
            funcion = "-1 Por debajo del peso ideal";

        } else if (calculo >= 20 && calculo <= 25) {
            funcion = "0 Peso ideal";

        } else if (calculo > 25) {
            funcion = "1 Sobrepeso";

        }
        salida = salida + "Peso ideal: \t" + funcion + "\n";

    }

    public void NomSexEdPeAl() {
        Nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la persona"));
        salida = salida + "Nombre: \t" + Nombre + "\n";
    }

    public void NomSexEd() {
        Nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");

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

    public void comprobarSexo(char sexo) {
        if (sexo == 'h') {
            sexo = 'H';
        } else if (sexo == 'm') {
            sexo = 'M';
        } else {
            sexo = 'H';
        }
        salida = salida + "Sexo: \t" + sexo + "\n";
    }

    public void Informacion() {
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
