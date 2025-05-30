import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Comparar los números y realizar las operaciones correspondientes
        if (numero1 > numero2) {
            double suma = numero1 + numero2;
            double diferencia = numero1 - numero2;
            System.out.println("El primer número es mayor.");
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = numero1 * numero2;
            if (numero2 != 0) {
                double division = numero1 / numero2;
                System.out.println("El primer número no es mayor.");
                System.out.println("Producto: " + producto);
                System.out.println("División: " + division);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        }

        scanner.close();
    }
}
