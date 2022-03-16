package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.NomSexEdPeAl();
        persona1.esMayorDeEdad();
        persona1.CalcularIMC();
        persona1.comprobarSexo('h');
        persona1.Informacion();
        persona1.generaDUI();

        Persona persona2 = new Persona();
        persona2.NomSexEd();
        persona2.esMayorDeEdad();
        persona2.Informacion();

        Persona persona3 = new Persona();
        persona3.setNombre("Carlos");
        persona3.setEdad(18);
        persona3.setSexo('h');
        persona3.setPesoYAltura(45, 1.72);
        persona3.Informacion();
    }

}
