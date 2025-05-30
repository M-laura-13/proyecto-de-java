public class CadenaInmutable {

    public static void main(String[] args) {
        String texto = "Hola";

        System.out.println("Antes de modificar: " + texto);

        // Llamamos al método que intenta modificar la cadena
        modificarCadena(texto);

        System.out.println("Después de modificar (sin retorno): " + texto);

        // Si queremos ver un cambio, debemos capturar el valor retornado
        texto = modificarCadenaRetorno(texto);
        System.out.println("Después de modificar (usando retorno): " + texto);
    }

    // Método que intenta modificar la cadena (no tiene efecto)
    public static void modificarCadena(String texto) {
        texto = texto + " mundo"; // Esto no afecta la variable original
    }

    // Método que devuelve una nueva cadena modificada
    public static String modificarCadenaRetorno(String texto) {
        return texto + " mundo"; // Devuelve una nueva cadena
    }
}
