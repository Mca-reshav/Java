import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Check Prime number");
        int i,m=0,f=0;
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" Not prime");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" not prime");
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(n+" Prime");
            }
        }
    }
}
