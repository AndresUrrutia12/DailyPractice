import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*Crea un programa que permita gestionar las notas de los estudiantes de una clase.
Utilizarás arrays para almacenar las notas de los estudiantes y realizar diversas operaciones sobre ellas.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Gestor de Notas");
        System.out.println("Ingresa el numero de estudiantes:");

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        int[] notes = new int[numberOfStudents];
        int note;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Ingresa la nota del estudiante "+ (i+1) + ":");
            note = input.nextInt();
            notes[i] = note;
        }

        System.out.println("Opciones disponibles:");
        System.out.println("1.Calcular el promedio de notas de la clase.");
        System.out.println("2.Encontrar la nota máxima y mínima.");
        System.out.println("3.Mostrar las notas en orden ascendente.");
        System.out.println("4.Mostrar las notas en order descendente.");
        System.out.println("5.Buscar una nota específica.");
        System.out.println("6.Calcular la cantidad de estudiantes que aprobaron y reprobaron.");

        int option = 0;
        do {

            System.out.println("Ingresa el número de opción:");

            option = input.nextInt();

            if (option == 1) {
                String averageOfNotes = Main.averageOfNotes(notes);
                System.out.println(averageOfNotes);
            } else if (option == 2) {
                String maxAndMinNotes = Main.maxAndMinNote(notes);
                System.out.println(maxAndMinNotes);
            } else if (option == 3) {
                System.out.print("Notas en orden ascendente");
                Main.ascendingOrder(notes);
            } else if ( option == 4) {
                System.out.print("Notas en orden descendente");
                Main.decendingOrder(notes);
            } else if (option == 5) {
                System.out.println("Ingresa la nota a buscar: ");
                int noteToFind = input.nextInt();
                String findNote = Main.findANote(noteToFind, notes);
                System.out.println(findNote);
            } else if ( option == 6) {
                String approvedNotapproved = Main.ApprovedAndNotApproved(notes);
                System.out.println(approvedNotapproved);
            } else {
                System.out.println("Opción no valida. Por favor, ingresa una opción válida.");
            }
            System.out.println();
        }while (option < 8);

        System.out.println("Gracias por utilizar nuestro programa hasta la proxima");


    }
    public static String averageOfNotes (int[] array ){
        int notes = 0;
        for (int note: array) {
             notes += note;

        }
        return "El promedio de notas de la clase es: " + (notes/ array.length);
    }
    public static String maxAndMinNote ( int[] array ){
        int maxNote = array[0];
        int minNote = array[0];
        for (int i = 1 ; i < array.length ; i++){
            if (array[i] > maxNote) {
                maxNote = array[i];
            }
            if (array[i] < minNote){
                minNote = array[i];
            }
        }
        return "La nota maxima es "+ maxNote + " y la nota mínima es " + minNote;
    }

    public static void ascendingOrder (int[] array) {
        Arrays.sort(array);
        for (int note: array) {
            int counter = 0;
            System.out.print(","+note);
            counter++;
        }
    }

    public static void decendingOrder (int[] array) {
        Arrays.sort(array);
        for (int i = array.length-1; i > 0; i--) {
            System.out.print(","+array[i]);
        }
    }

    public static String findANote(int input,int[] array) {
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                position = i;
                return "La nota " + input + " se encuentra en la posicion " + (position+1)+ " del array.";
            } else if (input != array[i]) {
            }
        }
        return "Nota no encontrada";
    }

    public static String ApprovedAndNotApproved(int[] array) {
        int approved = 0;
        int notApproved = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 60) {
                approved++;
            } else {
                notApproved++;
            }
        }
        return "Cantidad de estudiantes que aprobaron: " + approved + "\n" + "Cantidad de estudiantes que reprobaron: " + notApproved;
    }

}