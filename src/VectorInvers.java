import java.util.Scanner;

public class VectorInvers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5];

        // Leer 5 cadenas desde el teclado
        System.out.println("Ingrese 5 palabras:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Mostrar el vector inverso
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInverso.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vectorInverso[i]);
        }

        scanner.close();
    }
}
