import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        WordCounting wc=new WordCounting();
        wc.wordCount();
    }
    void wordCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);
    }
}
