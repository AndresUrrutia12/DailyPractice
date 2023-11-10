import java.util.Scanner;

public class ContadorDeNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Ingresa un numero que sera el limite para contar pares eh impares:");
        int number = input.nextInt();
        int impares = 0;
        int pares = 0;

        for (int i = number; i >= 0; i--) {
            if (i%2 == 0) {
                pares++;
            } else if ( i%2 != 0) {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " pares y " + impares + " impares entre el 0 y " + number);
    }
}
