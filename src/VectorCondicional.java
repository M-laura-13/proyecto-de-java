import java.util.Scanner;

public class VectorCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;

        System.out.println("Ingrese hasta 10 números enteros (ingrese un número negativo para detener):");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo ingresado. Fin de la entrada.");
                break;
            }

            vector[i] = numero;
            contador++;
        }

        // Mostrar los elementos ingresados
        System.out.println("\nElementos introducidos en el vector:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }

        scanner.close();
    }
}
