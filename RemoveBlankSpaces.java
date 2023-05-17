import java.util.Scanner;

public class RemoveBlankSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Remove blank spaces from the sentence
        String finalSentence = sentence.replaceAll(" ", "");

        System.out.println("Original sentence: " + sentence);
        System.out.println("Final sentence: " + finalSentence);
    }
}
