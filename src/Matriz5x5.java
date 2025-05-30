import java.util.Random;

public class Matriz5x5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Llenar la matriz con números aleatorios del 1 al 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de números pares: " + contarPares(matriz));
        System.out.println("Cantidad de números impares: " + contarImpares(matriz));
        System.out.printf("Promedio de números impares: %.2f\n", promedioImpares(matriz));
        int[] posicionMayor = posicionNumeroMayor(matriz);
        System.out.println("Posición del número mayor: (" + posicionMayor[0] + ", " + posicionMayor[1] + ")");
    }

    // Método 1
    public static int contarPares(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Método 2
    public static int contarImpares(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Método 3
    public static double promedioImpares(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    contador++;
                }
            }
        }
        if (contador == 0) return 0;
        return (double) suma / contador;
    }

    // Método 4
    public static int[] posicionNumeroMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        int[] posicion = {0, 0};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
}
