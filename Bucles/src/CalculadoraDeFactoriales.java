import java.util.Scanner;

public class CalculadoraDeFactoriales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un numero para hallar el factorial:");
        int number = input.nextInt();
        int variable = 1 ;
        for (int i = 2; i <= number; i++) {
            variable = variable * i;
        }
        System.out.println("El factorial del numero " + number + " es " + variable);
    }
}
