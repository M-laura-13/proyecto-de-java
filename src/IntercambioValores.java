public class IntercambioValores {

    // Método que intenta intercambiar los valores de dos enteros
    public static void intercambiar(int x, int y) {
        System.out.println("   Dentro del método intercambiar:");
        System.out.println("   Valores iniciales: x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("   Valores después del intento de intercambio: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes de llamar al método intercambiar:");
        System.out.println("a = " + a + ", b = " + b);

        // Llamada al método intercambiar
        intercambiar(a, b);

        System.out.println("\nDespués de llamar al método intercambiar:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
