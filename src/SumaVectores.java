import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Leer valores para vector1
        System.out.println("Ingrese los valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        // Leer valores para vector2
        System.out.println("\nIngrese los valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular la suma: vector3 = vector1 + vector2
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar el resultado
        System.out.println("\nResultado (vector3 = vector1 + vector2):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }

        scanner.close();
    }
}
