import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        if (!validator.isValid(firstWord)) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (!validator.isValid(secondWord)) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        if (analyzer.isReverse(firstWord, secondWord))
            System.out.println(analyzer.transform(firstWord));
        else
            analyzer.analyze(firstWord, secondWord);

        scanner.close();
    }
}