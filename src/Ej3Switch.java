import java.util.Scanner;

public class Ej3Switch {
    //Escribe un programa que presente un menú al usuario, y dependiendo de la opción seleccionada, realice una operación simple (como sumar dos números, restar, multiplicar o dividir) utilizando una estructura switch//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 si quiere sumar");
        System.out.println("Ingrese 2 si quiere restar");
        System.out.println("Ingrese 3 si quiere multiplicar ");
        System.out.println("Ingrese 4 si quiere dividir");

        byte seleccion = scanner.nextByte();

        System.out.print("Ingrese el primer numero:");
        byte num1= scanner.nextByte();
        System.out.print("Ingrese el segundo numero:");
        byte num2 = scanner.nextByte();

        

        switch (seleccion) {
            case 1:
            System.out.println("El resultado es:"+(num1+num2));
             break;
            case 2: 
            System.out.println("El resultado es:"+(num1 -num2));
                break;
            case 3: 
            System.out.println("El resultado es:"+(num1*num2));
              break;
            case 4:
            if (num2!=0) {
                System.out.println("El resultado es:"+(num1/num2));
                break;
            }else {
                System.out.println("Error: No se puede dividir entre 0");
            }
            
        
            default:
            System.out.println("Operacion no valida ");
                break;
                
        }

            
            scanner.close();
     }
}
