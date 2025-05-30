import java.util.Arrays;
import java.util.Random;

public class VectorOrdenado {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random rand = new Random();

        // Inicializar el vector con valores aleatorios del 1 al 100
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100) + 1; // valores entre 1 y 100
        }

        // Mostrar el vector original
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(vector));

        // Ordenar el vector de menor a mayor
        Arrays.sort(vector);

        // Mostrar el vector ordenado
        System.out.println("\nVector ordenado de menor a mayor:");
        System.out.println(Arrays.toString(vector));
    }
}

