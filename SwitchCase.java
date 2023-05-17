
import java.util.Scanner;

    public class SwitchCase {
        public static void main(String[] args){
            System.out.println("============Calculator===============");

            System.out.println("Enter First Number");
            Scanner a =new Scanner(System.in);
            float num1=a.nextInt();

            System.out.println("Enter Second Number");
            Scanner b =new Scanner(System.in);
            float num2=b.nextInt();

            System.out.println("Enter Operator");
            Scanner op =new Scanner(System.in);
            int data=op.nextInt();

            switch (data){
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '^':
                    System.out.println(Math.pow(num1,num2));
                    break;
                default:
                    System.out.println("Enter a valid operator");
            }
        }
    }

