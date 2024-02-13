import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(winner(userDecision(), javaDecision()));
    }
    public static String userDecision(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your option: \n1.- Scissors \n2.- Rock \n3.- Paper");
        int userInput = input.nextInt();
        String userDecision = "";
        switch (userInput){
            case 1:
                userDecision = "Scissors";
                break;
            case 2:
                userDecision = "Rock";
                break;
            case 3:
                userDecision = "Paper";
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return userDecision;
    }
    public static String javaDecision(){
        Random random = new Random();
        int option = random.nextInt(3) + 1;
        return switch (option) {
            case 1 -> "Scissors";
            case 2 -> "Rock";
            case 3 -> "Paper";
            default -> "";
        };
    }
    public static String winner(String userDecision, String javaDecision){
        String winner = "";
        if (userDecision.equals(javaDecision)){
            winner = "It's a tie";
        }else if (userDecision.equals("Scissors") && javaDecision.equals("Paper")){
            winner = "You win because scissors beats paper";
        }else if (userDecision.equals("Rock") && javaDecision.equals("Scissors")){
            winner = "You win because rock beats scissors";
        }else if (userDecision.equals("Paper") && javaDecision.equals("Rock")){
            winner = "You win because paper beats rock";
        }else {
            winner = "You lose because " + javaDecision + " beats " + userDecision + " ";
        }
        return winner;
    }
}