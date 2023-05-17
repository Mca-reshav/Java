public class Check {
    public static String removeDuplicates(String input) {
        char[] inputArray = input.toCharArray();
        int len = inputArray.length;
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        int newIndex = 0;
        for (int i = 0; i < len; i++) {
            char ch = inputArray[i];
            if (!seen[ch]) {
                seen[ch] = true;
                inputArray[newIndex++] = ch;
            }
        }

        return new String(inputArray, 0, newIndex);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String output = removeDuplicates(input);
        System.out.println("Input string: " + input);
        System.out.println("String with duplicate characters removed: " + output);
    }
}
