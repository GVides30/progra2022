package Ejercicio1;

public class Main {

    public static void main(String[] args) {
      
        Persona persona1 = new Persona();
        persona1.NomSexEdPeAl();
        persona1.esMayorDeEdad();
        persona1.CalcularIMC();
        persona1.comprobarSexo();
        persona1.to_String();
        persona1.generaDUI();

        Persona persona2 = new Persona();
        persona2.NomSexEd();
        persona2.esMayorDeEdad();
        persona2.comprobarSexo();
        persona2.to_String();
    }

}
