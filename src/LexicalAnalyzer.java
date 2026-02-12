public class LexicalAnalyzer {

    public boolean isReverse(String first, String second) {
        String reversed = new StringBuilder(first).reverse().toString();
        return reversed.equalsIgnoreCase(second);
    }

    public String transform(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.toLowerCase().replaceAll("[aeiou]", "@");
    }

    public void analyze(String first, String second) {

        String combined = (first + second).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : combined.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1)
                vowels++;
            else if (Character.isLetter(ch))
                consonants++;
        }

        if (vowels > consonants)
            printUnique(combined, true);
        else if (consonants > vowels)
            printUnique(combined, false);
        else
            System.out.println("Vowels and consonants are equal");
    }

    private void printUnique(String text, boolean vowelMode) {

        int count = 0;
        String result = "";

        for (char ch : text.toCharArray()) {

            boolean isVowel = "AEIOU".indexOf(ch) != -1;

            if (vowelMode && isVowel && result.indexOf(ch) == -1) {
                result += ch;
                count++;
            }

            if (!vowelMode && !isVowel &&
                    Character.isLetter(ch) &&
                    result.indexOf(ch) == -1) {
                result += ch;
                count++;
            }

            if (count == 2)
                break;
        }

        System.out.println(result);
    }
}