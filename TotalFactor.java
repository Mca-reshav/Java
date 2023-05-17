import java.util.Scanner;

public class TotalFactor {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("Count="+count);
    }
}
