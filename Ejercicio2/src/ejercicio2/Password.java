package ejercicio2;

public class Password {

    //atributos e inicialización de datos
    private int longitud = 8;
    private String contrasenia = "";
    private final char letrasMayus[] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final int num[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final char letrasMinus[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private String informacion = "Password:\t";

    //Muestra de contraseña
    Password(int longitud) {
        this.longitud = longitud;
        contrasenia = GenPassword();
    }

    //Establecer longitud de la contraseña
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Métodos
    public String getPassword() {
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    //Generación aleatoria de la contraseña
    private String GenPassword() {

        for (int paso = 0; paso < this.longitud; paso++) {
            int opcion = (int) (Math.random() * 3 + 1);
            if (opcion == 1) {
                int val = (int) (Math.random() * 26);
                char minusculas = this.letrasMinus[val];
                informacion += minusculas;

            } else if (opcion == 2) {
                int val = (int) (Math.random() * 26);

                char mayusculas = this.letrasMayus[val];
                informacion += mayusculas;
            } else {
                int val = (int) (Math.random() * 10);
                int numero = this.num[val];
                informacion += numero;
            }
        }

        return informacion;
    }

    //Comprobación de seguridad de la contraseña
    public boolean esFuerte() {
        boolean Fuerza;
        int Mayus = 0, Minus = 0, Num = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isLetter(contrasenia.charAt(i)) && Character.isUpperCase(contrasenia.charAt(i))) {
                Mayus++;

            } else if (Character.isLetter(contrasenia.charAt(i)) && Character.isLowerCase(contrasenia.charAt(i))) {
                Minus++;

            } else if (Character.isDigit(contrasenia.charAt(i))) {
                Num++;

            }
        }
        if (Mayus >= 2 && Minus >= 1 && Num >= 5) {
            Fuerza = true;
        } else {
            Fuerza = false;
        }

        return Fuerza;

    }

}
