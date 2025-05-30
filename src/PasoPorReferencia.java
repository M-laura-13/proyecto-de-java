public class PasoPorReferencia {

    public static void main(String[] args) {
        // Crear el array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Mostrar el array antes de la modificación
        System.out.println("Antes de modificar:");
        mostrarArray(numeros);

        // Llamar al método que modifica el array
        modificarArray(numeros);

        // Mostrar el array después de la modificación
        System.out.println("Después de modificar:");
        mostrarArray(numeros);
    }

    // Método para modificar los valores del array
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  // Multiplica cada valor por 2
        }
    }

    // Método auxiliar para mostrar el contenido del array
    public static void mostrarArray(int[] arr) {
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

