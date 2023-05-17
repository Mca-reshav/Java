import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);

}
}
