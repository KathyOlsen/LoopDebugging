import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        System.out.println("Please type something and I will tell you what you just typed: ");
        userInput = keyboard.nextLine();
        System.out.println(userInput);

        while (!userInput.equalsIgnoreCase("")) {
            System.out.println("Please type something and I will tell you what you just typed: ");
            userInput = keyboard.nextLine();
            keyboard.nextLine();
            System.out.println(userInput);
        }

    }
}