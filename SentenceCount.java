import java.util.Scanner;

public class SentenceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph: ");
        String paragraph = scanner.nextLine();
        String sentenceEndPattern = "[.?!]\\s+";
        String[] sentences = paragraph.split(sentenceEndPattern);
        int sentenceCount = sentences.length;
        System.out.println("Number of sentences in the paragraph: " + sentenceCount);
    }
}
