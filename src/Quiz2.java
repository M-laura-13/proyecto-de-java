import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese el num de inicio: ");
        int inicio = input.nextInt();
        System.out.print("ingrese el num final: ");
        int fin = input.nextInt();
        if (inicio > fin) {
            System.out.println("entrada no valida");
            input.close();
            return;

        }

        boolean encontrado = false;
        for (int i = Math.max(2, inicio); i < fin; i++) {
            int contadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                    if (contadorDivisores == 1) {
                        primerDivisor = j;
                    } else if (contadorDivisores == 2) {
                        segundoDivisor = j;
                    } else {
                        break;
                    }
                }
            }
            if (contadorDivisores == 2) {
                encontrado = true;
                System.out.println(i + " Numero amigo " + primerDivisor + " - " + segundoDivisor);
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron numeros amigos ");
        }

        input.close();
    }

}
