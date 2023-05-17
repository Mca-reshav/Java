import java.util.*;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        boolean containsAllLetters = true;
        for (boolean letter : alphabet) {
            if (!letter) {
                containsAllLetters = false;
                break;
            }
        }

        if (containsAllLetters) {
            System.out.println("-1");
        } else {
            System.out.print("Missing letters: ");
            for (int i = 0; i < alphabet.length; i++) {
                if (!alphabet[i]) {
                    char missingLetter = (char) ('a' + i);
                    System.out.print(missingLetter + " ");
                }
            }
        }
    }
}
