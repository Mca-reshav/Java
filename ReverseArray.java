public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Array");
        int[] arr={10,20,30,40,50,60};
        int len=arr.length;
        System.out.println("This is your array");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("This is your reverse array");
        for(int i=len-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
