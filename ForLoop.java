
import java.util.Scanner;

    public class ForLoop {
        public static void main(String[] args){
            System.out.println("Enter the number to print its table");
            Scanner scan1= new Scanner(System.in);
            int a=scan1.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(a+"x"+i+"="+a*i);
            }
        }
    }

