import java.util.Scanner;

/*Escribe un programa que lea una cadena de texto del usuario y luego imprima todas las palabras que tengan tres letras o menos.*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Escribe tu texto a continuacion");
        String text = input.nextLine();
        String[] words = text.split(" ");
        System.out.println("Palabras que tienen 3 o menos letras");
        for (String word:words) {
            if (word.length() <= 3){
                System.out.println(word);
            }
        }
    }
}