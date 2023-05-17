public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int len=arr.length+1;
        int total=(len*(len+1))/2;
        for(int i=0;i<arr.length;i++){
            total=total-arr[i];
        }
        System.out.println(total);
    }
}
