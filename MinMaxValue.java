

public class MinMaxValue {
    public static void main(String[] args) {
        System.out.println("Minimum and Maximum value in an array");
        int[] arr={2,3,1,4,3,7,5};
        int len= arr.length;
        int min=arr[0];
        int max=arr[0];
        if(len>1){
            for(int i=1;i<len;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println();
            System.out.println("Min is "+min);
            System.out.println("Max is "+max);
        }else{
            System.out.println("Min/Max "+arr[0]);
        }

    }
}
