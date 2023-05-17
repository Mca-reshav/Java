import java.util.Scanner;

public class CipherKey {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your message");
        String str=scan.nextLine();

        String str2=str.replaceAll(" ","");
        String[] wordCount=str.split(" ");
        System.out.println("Original string:"+str);
        System.out.println("New string:"+str2);
        System.out.println("count of words:"+wordCount.length);

        String checkString="abcdefghijklmnopqrstuvwxyz";
        char[] cs=checkString.toCharArray();
        int csLen=cs.length;
        for(int i =0;i<str2.length();i++){
            for(int j=0;j<csLen;j++){
                if(str2.charAt(i)==cs[j]){
                    System.out.print(cs[j+5]+" ");
                }
            }
        }
         /*
        print characters of the given string
        *
        for(int i=0;i<csLen;i++){
            System.out.print(cs[i]+" ");
        }
        * */

        //search the character present in the given string
        /*
        *  System.out.println("Search the index of a character");
        Scanner scan=new Scanner(System.in);
        String a= scan.next();
        char[] c=a.toCharArray();
        for(int j=0;j<str2.length();j++){
            if(c[0]==str2.charAt(j)){
                System.out.println("Matched found at:"+j);
            }else{
                System.out.println("No match found");
                break;
            }
        }
        * */

        /*
        int i=0;
        while(i<str2.length()-1){
            if(str2.charAt(i)==c[0]){
                System.out.println(str.charAt(i)+" character at "+i+" index");
            }
            i++;
        }
        *  */
    }
}
