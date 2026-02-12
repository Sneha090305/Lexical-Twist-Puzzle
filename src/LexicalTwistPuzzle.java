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

            String combined = (firstWord + secondWord).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char ch : combined.toCharArray()) {

                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            if (vowels > consonants) {

                int count = 0;
                String result = "";

                for (char ch : combined.toCharArray()) {

                    if ("AEIOU".indexOf(ch) != -1 && result.indexOf(ch) == -1) {
                        result += ch;
                        count++;
                    }

                    if (count == 2) break;
                }

                System.out.println(result);

            } else if (consonants > vowels) {

                int count = 0;
                String result = "";

                for (char ch : combined.toCharArray()) {

                    if ("AEIOU".indexOf(ch) == -1 &&
                            Character.isLetter(ch) &&
                            result.indexOf(ch) == -1) {

                        result += ch;
                        count++;
                    }

                    if (count == 2) break;
                }

                System.out.println(result);

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        scanner.close();
    }
}