import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Validation for first word
        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return; // graceful termination
        }

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validation for second word
        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return; // graceful termination
        }

        scanner.close();
    }
}