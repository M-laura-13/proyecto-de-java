public class PasoPorValor {

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Antes de llamar a incrementar: x = " + x);

        // Llamada al método pero sin usar el valor retornado
        incrementar(x);
        System.out.println("Después de llamar a incrementar (sin guardar el retorno): x = " + x);

        // Llamada al método usando el valor retornado
        x = incrementar(x);
        System.out.println("Después de llamar a incrementar (guardando el retorno): x = " + x);
    }

    // Método que incrementa el valor y lo retorna
    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }
}
