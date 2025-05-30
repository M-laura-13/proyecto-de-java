public class ListaMatriz {
    public static void main(String[] args) {
         // Declaración de una matriz de 3 filas y 4 columnas
         
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int valor = matriz[1][2]; // Accede al elemento en la fila 1, columna 2.
       System.out.println("Valor en la fila 1, columna 2: " + valor);
    }
}
