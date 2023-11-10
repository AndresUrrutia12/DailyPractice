import java.util.Arrays;
import java.util.Scanner;

/*Escribe un programa que lea 5 números enteros por teclado y los guarde en un array. Luego debe ordenar los elementos del array de menor a mayor y mostrarlos en pantalla*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe 5 numeros");
        int[] numbers = new int[5];
        for (int i = 0; i < 5 ; i++){
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.print("Numeros ordenados: ");
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}