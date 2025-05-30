public class RecorrerForEach {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Pedro", "María"};

        // Usando for-each para recorrer el array
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // Usando for-each para recorrer un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
