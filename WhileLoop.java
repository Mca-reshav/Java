import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        System.out.println("Enter the max length");
        Scanner scan= new Scanner(System.in);
        int maxLen= scan.nextInt();
        int i=0;
        while(i<maxLen){
            i++;
            System.out.print(i+" ");
        }
    }
}

