
import java.util.Scanner;

    public class FunctionParams {
        public static void main(String[] args){
            System.out.println("======Calculate your interest======");

            System.out.print("Enter Principle (Rs.) = ");
            Scanner scan1=new Scanner(System.in);
            int p=scan1.nextInt();

            System.out.print("Enter Rate (%) = ");
            Scanner scan2=new Scanner(System.in);
            int r=scan2.nextInt();

            System.out.print("Enter Time (yr) = ");
            Scanner scan3=new Scanner(System.in);
            int t=scan3.nextInt();

            System.out.println("===============Exit=================");

            FunctionParams fp=new FunctionParams();//object
            fp.simpleInterest(p,r,t);

            compoundInterest(p,r,t);
        }
        void simpleInterest(int p, int r, int t){
            int si=(p*r*t)/100;
            System.out.println("Simple Interest= "+si);
        }
        public static void compoundInterest(int p, float r, int t){
            double ci=(p*Math.pow((1+r/100),t))-p;
            double data=Math.round(ci);
            System.out.println("Compound Interest= "+data);

        }
    }

