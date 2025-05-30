// Definición de la clase Rectangulo
class Rectangulo {
    int ancho;
    int alto;

    // Constructor para inicializar los atributos
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para imprimir los atributos del rectángulo
    public void imprimir() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}

public class ModificarObjeto {

    // Método que acepta un objeto Rectangulo y modifica sus atributos
    public static void modificarRectangulo(Rectangulo r) {
        System.out.println("   Dentro del método modificarRectangulo:");
        System.out.print("   Valores iniciales del objeto recibido: ");
        r.imprimir();

        r.ancho = 50; // Modificamos el ancho del objeto referenciado
        r.alto = 100; // Modificamos el alto del objeto referenciado

        System.out.print("   Valores después de la modificación dentro del método: ");
        r.imprimir();
    }

    public static void main(String[] args) {
        // Creamos un objeto Rectangulo en el método main
        Rectangulo miRectangulo = new Rectangulo(10, 20);

        System.out.println("Antes de llamar al método modificarRectangulo:");
        System.out.print("miRectangulo: ");
        miRectangulo.imprimir();

        // Llamamos al método modificarRectangulo pasando el objeto
        modificarRectangulo(miRectangulo);

        System.out.println("\nDespués de llamar al método modificarRectangulo:");
        System.out.print("miRectangulo: ");
        miRectangulo.imprimir();
    }
}