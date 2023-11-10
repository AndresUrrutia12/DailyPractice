/*Escribe un programa que lea una cadena de texto del usuario y luego imprima todas las palabras que comiencen con una vocal.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your phrase, please");
        String phrase = input.nextLine();
        phrase.toLowerCase();
        String[] words = phrase.split(" ");

        System.out.println("Words that start with a vowel:");
        for (String word: words) {
            switch (word.charAt(0)) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(word);
            }
        }

    }
}