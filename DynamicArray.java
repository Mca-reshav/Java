import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args){

        System.out.println("Enter total rows");
        Scanner scan1=new Scanner(System.in);
        int rows=scan1.nextInt();

        System.out.println("Enter total cols");
        Scanner scan2=new Scanner(System.in);
        int cols=scan2.nextInt();

        String[][] str=new String[rows][cols];

        System.out.println("Enter the elements");
        Scanner scan3=new Scanner(System.in);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                str[i][j]=scan3.next();
            }
        }
        System.out.println("Here is your Dynamic 2Dimensional Array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("["+i+"]"+"["+j+"] "+str[i][j]);
            }
        }
    }
}
