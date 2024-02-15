import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello welcome to your calculator! \nChoose an option: \n1.- Sum \n2.- Substract \n3.- Multiply \n4.- Divide");
        int option = 0;
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
        System.out.println("Type the first number");
        int a = input.nextInt();
        System.out.println("Type the second number");
        int b = input.nextInt();
        switch (option){
            case 1:
                System.out.println("The result is: " + sum(a, b));
                break;
            case 2:
                System.out.println("The result is: " + substract(a, b));
                break;
            case 3:
                System.out.println("The result is: " + multiply(a, b));
                break;
            case 4:
                System.out.println("The result is: " + divide(a, b));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int substract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        if (b == 0){
            System.out.println("You can't divide by 0");
            return 0;
        }
        return a / b;
    }
}