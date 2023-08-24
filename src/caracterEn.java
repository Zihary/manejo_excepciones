import java.util.Scanner;

public class caracterEn {

    public static char caracterEn(String cadena, int posicion) throws Exception {
        int longitudCadena = cadena.length();

        if (posicion >= 0 && posicion < longitudCadena) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("El entero está fuera de los límites de la cadena");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa un entero (posición): ");
        int posicion = scanner.nextInt();

        try {
            char resultado = caracterEn(cadena, posicion);
            System.out.println("El caracter en la posición " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
