public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Check the given string is a palindrome or not");
        CheckPalindrome cp=new CheckPalindrome();
       // cp.checkPalindrome("madam");
        System.out.println( cp.checkPalindrome("madams"));
    }
    public boolean checkPalindrome(String word){       //boolean
        char[] charArray=word.toCharArray();
        System.out.println(word.length());
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                //System.out.println("Not a palindrome");
                return false;
            }
            start++;
            end--;
        }
        //System.out.println("Yes,it is a palindrome");
        return true;
    }
}
