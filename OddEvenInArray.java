import java.util.Scanner;

public class OddEvenInArray {
    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elements");
        Scanner scan2=new Scanner(System.in);
        for(int i=0;i<len;i++){
            arr[i]=scan2.nextInt();

        }
        System.out.println("Here is your array");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        //total count of elements
        int count=0;
        for(int i=0;i<len;i++){

            if(arr[i]%2!=0){
                count++;
            }
        }
        //odd
        int[] ary=new int[count];
        int idx=0;
        for(int i=0;i<len;i++){
            if(arr[i]%2!=0){
                ary[idx]=arr[i];
                idx++;
            }
        }
        //even
        int len2=len-count;
        int[] ary2=new int[len2];
        int idx2=0;
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                ary2[idx2]=arr[i];
                idx2++;
            }
        }
        System.out.println(" ");
        System.out.println("Odd numbers in given array");
        for(int i=0;i<count;i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Even numbers in given array");
        for(int i=0;i<len2;i++){
            System.out.print(ary2[i]+" ");
        }

    }
}
