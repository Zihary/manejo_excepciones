import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String lectTeclado = scanner.nextLine();

        try {
            char resultado = caracterEn.caracterEn(lectTeclado, 7);
            System.out.println("El caracter en la posición 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        }
    }
}