package Stack;

import java.util.Stack;

public class StringReverseWithStack {
   public static String reverseString(String str){
       Stack<Character> stack=new Stack<>();
       char[] chars=str.toCharArray();

       for(char c:chars){
           stack.push(c);
       }
       int len=str.length();
       for(int i=0;i<len;i++){
           chars[i]= stack.pop();
       }
       return new String(chars);
   }
    public static void main(String[] args) {
        System.out.println("Reverse a string using stack");
        String str="Hello Java";
        System.out.println("String:"+str);
        System.out.println("Reverse string:"+reverseString(str));
    }
}
