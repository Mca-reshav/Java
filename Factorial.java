
import java.util.Scanner;
    public class Factorial {
        public static void main(String[] args){
            System.out.println("Enter the number");
            Scanner val= new Scanner(System.in);
            int i= val.nextInt();

            int pro=1;
            int pro2=1;
            for(int a=1;a<=i;a++){
                pro=pro*a;
            }
            for(int a=i;a>=1;a--){
                pro2=pro2*a;
            }

            System.out.println("Factorial = "+pro);
            System.out.println("Factorial2 = "+pro2);
        }
    }

