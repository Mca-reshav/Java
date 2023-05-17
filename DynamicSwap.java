import java.util.Scanner;

public class DynamicSwap {
    public static void main(String[] args){
        System.out.println("Enter length");
        Scanner scan=new Scanner(System.in);
        int len= scan.nextInt();
        double[] ary=new double[len];
        for(int i=0;i<len;i++) {
            double a = Math.floor(Math.random() * 100);
            ary[i]=a;
        }
        for(int i=0;i<len;i++){
            System.out.print("["+ary[i]+"]");
        }
        System.out.println(" ");
        System.out.println("Do You Want To Swap?");
        System.out.println("Press '1' If 'Yes', Press '0' If 'No'");
        Scanner scan2=new Scanner(System.in);
        int b= scan2.nextInt();
        switch (b){
            case 0:
                System.out.println("Re-Run the program");
                break;
            case 1:
                System.out.println("Enter the index of the number");
                Scanner scan3=new Scanner(System.in);
                int x=scan3.nextInt();

                System.out.println("Enter the index of the swap number");
                Scanner scan4=new Scanner(System.in);
                int y=scan4.nextInt();

                System.out.println("Entered Indices are=["+x+","+y+"]");
                System.out.println(ary[x]+","+ary[y]);
                ary[x]=ary[x]+ary[y];
                ary[y]=ary[x]-ary[y];
                ary[x]=ary[x]-ary[y];
                for(int k=0;k<len;k++){
                    System.out.print("["+ary[k]+"]");
                }
                break;
            default:
                System.out.println("Enter the valid options");
        }
    }
}
