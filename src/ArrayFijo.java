public class ArrayFijo {
    public static void main(String[] args) {

        int[] numeros = new int[5]; // Array de 5 enteros

        // Asignar valores manualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int acumuladorSuma = 0; // Variable para almacenar la suma de los elementos

        for (int i = 0; i < numeros.length; i++) {
            acumuladorSuma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + acumuladorSuma);
    }
}
            
        

