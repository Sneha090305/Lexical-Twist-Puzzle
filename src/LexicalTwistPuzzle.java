import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // UC4 Logic: Reverse Check
        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {

            String lower = reversed.toLowerCase();
            String transformed = lower.replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {
            System.out.println("Words are NOT reverse of each other");
        }

        scanner.close();
    }
}