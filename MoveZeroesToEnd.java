public class MoveZeroesToEnd {
    public static void main(String[] args) {
        System.out.println("Move zeroes to the end of an array and maintaining the order of non-zero elements as before");
        int[] arr={4,0,1,0,0,7,9,0,5,0};
        int len=arr.length;
        int j=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0 && arr[j]==0){ //i and j will point to non-zero and zero element respectively
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println();
    for(int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
    }
    }

}
