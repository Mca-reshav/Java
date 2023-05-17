public class ResizeArray {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,3,2,9};
        int len=13;
        int[] temp=new int[len];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
