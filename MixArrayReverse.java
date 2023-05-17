import java.util.Arrays;

public class MixArrayReverse {
    public static void main(String[] args) {
        // Input array containing 0 to 9 numbers and a to z letters
        char[] arr = {'a', 'b', 'c', '1', '2', '3', 'd', 'e', 'f', '4', '5', '6', 'g', 'h', 'i', '7', '8', '9', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0'};

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Skip over non-letter characters
            while (start < end && !Character.isLetter(arr[start])) {
                start++;
            }
            // Skip over non-letter characters
            while (start < end && !Character.isLetter(arr[end])) {
                end--;
            }
            // Swap the letters in the array
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
