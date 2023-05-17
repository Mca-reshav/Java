

public class SecondMaxValueInArray {
    public static void main(String[] args) {
        int[] arr={20,20,50,40,10};
        int len=arr.length;
        int max=arr[0];
        int max2=arr[0];
        for(int i=1;i<len;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            } else if (arr[i]>max2 && arr[i]!=max) {
                max2=arr[i];
            }
        }
        System.out.println();
        System.out.println("Max: "+max+" Second Max: "+max2);
    }
}
