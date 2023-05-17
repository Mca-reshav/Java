import java.util.Scanner;

public class DynamicAverage {
    public static void main(String[] args){
        System.out.println("Enter the length");
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int[] arr=new int[a];
        float sum=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<a;i++){
            arr[i]= scan.nextInt();
            sum=sum+arr[i];
        }
        float avg=sum/a;
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("sum="+sum);
        System.out.println("length="+a);
        System.out.println("avg="+avg);
    }
}
