public class Ej2For {
    // cuántos números pares hay entre 1 y 100 utilizando un ciclo//
    public static void main(String[] args) {
        byte contador = 0;
    
        for (int i=1;i<=100;i++){
            if (i%2==1) { 
                contador++;
            }
            
        }
        System.out.println("La cantidad de numeros pares que hay entre 1 a 100 es:"+ contador);
 

    }
}
