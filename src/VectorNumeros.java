import java.util.Random;
public class VectorNumeros {
    public static void main(String[] args) {
        int[] vector_numeros = new int [10];
        Random rand = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1; // Números aleatorios del 1 al 100
        }

        System.out.println("Número\tCuadrado\tCubo");
        for (int num : vector_numeros) {
            int cuadrado = num * num;
            int cubo = num * num * num;
            System.out.println(num + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
