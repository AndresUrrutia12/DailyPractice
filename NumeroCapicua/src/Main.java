/*Escribe un programa en Java que solicite al usuario un número entero positivo y luego determine si es un número capicúa o no*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the number to find if it is capicua");
        Integer number = input.nextInt();
        String numberReverse = "";
        Integer result = number;
        Integer reminder;
        String reminderString;
        do {
            reminder = result % 10;
            reminderString = reminder.toString();
            numberReverse += reminderString;
            result /= 10;

        }while (result > 0);

        String numberString = Integer.toString(number);

        if (numberString.equals(numberReverse)){
            System.out.println("Capicua");
        } else {
            System.out.println("No capicua");
        }
    }
}