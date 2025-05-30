
import java.util.Scanner;

public class VectorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] original = new String[5];
        String[] inverso = new String[5];

        // Leer 5 cadenas desde teclado
        System.out.println("Ingresa 5 palabras:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            original[i] = scanner.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }

        // Mostrar el vector en orden inverso
        System.out.println("\nVector en orden inverso:");
        for (String palabra : inverso) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}
