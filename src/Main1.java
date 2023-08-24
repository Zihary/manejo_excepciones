import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un valor numérico: ");
        double valor = scanner.nextDouble();

        try {
            if (valor < 0) {
                throw new NumeroNegativoExcepcion("El número es negativo");
            } else {
                double raizCuadrada = Math.sqrt(valor);
                System.out.println("La raíz cuadrada de " + valor + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
