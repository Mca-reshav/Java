import java.util.Scanner;

public class SumOfDiagonals {
    public static void main(String[] args) {
        System.out.println("To find difference between diagonals of a square matrix");
        System.out.println("Enter the dimension of the matrix");
        Scanner scan= new Scanner(System.in);
        int dim=scan.nextInt();
        System.out.println("Chosen dimension is:"+dim);
        int[][] arr=new int[dim][dim];
        System.out.println("Enter the elements");
        Scanner scan2=new Scanner(System.in);
        for(int i = 0; i < dim; i++){
            for(int j=0;j<dim;j++){
                arr[i][j]=scan2.nextInt();
            }
        }
        System.out.println("Given array");
        for(int i = 0; i < dim; i++){
            System.out.println();
            for(int j=0;j<dim;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("Diagonal 1");
        int sum1=0;
        for(int i=0;i<dim;i++){
            for(int j=i;j<=i;j++){
                System.out.print(arr[i][j]+" ");
                sum1+=arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum1:"+sum1);
        System.out.println("Diagonal 2");
        int sum2=0;
        for(int i=0;i<dim;i++){
            for(int j=dim-(i+1);j<dim-i;j++){
                System.out.print(arr[i][j]+" ");
                sum2+=arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum2:"+sum2);
        int diff=sum1-sum2;
        System.out.println("Absolute difference of both of the diagonals is:"+Math.abs(diff));
    }
}



    


