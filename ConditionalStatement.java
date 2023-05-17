import java.util.Scanner;
public class ConditionalStatement {
        public static void main(String[] args) {
            System.out.println("Please enter your percentage");
            Scanner scan=new Scanner(System.in);
            int percentage=scan.nextInt();
            scan.close();
            if(percentage>=1 && percentage<=100){
                if(percentage==40){
                    System.out.println("Just Passed");
                }
                if(percentage>40 && percentage<=50){
                    System.out.println("Third Division");
                }
                if(percentage>50 && percentage<=60){
                    System.out.println("Second Division");
                }
                if(percentage>60 && percentage<=75){
                    System.out.println("First Division");
                }
                if(percentage>75 && percentage<=90){
                    System.out.println("First Division with extinction");
                }
                if(percentage>90 && percentage<100){
                    System.out.println("Outstanding");
                }
                if(percentage<40){
                    System.out.println("Better luck next time");
                }
            }else{
                System.out.println("Enter valid percentage");
            }

        }
    }

