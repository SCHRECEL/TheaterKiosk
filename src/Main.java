import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge = 0;

        System.out.println("Enter your age: ");
        userAge = scanner.nextInt();

        if (userAge >= 21){
            System.out.println("You are over 21, you get a wristband.");
        }
        else System.out.println("Continue");

    }
}