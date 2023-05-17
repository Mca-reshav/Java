public class Strings {
    public static void main(String[] args){
        String str="Hello";
        System.out.println(str.length());
        System.out.println(str.substring(2,4));
        System.out.println(str.replace("Hello","hi"));
       // System.out.println(str.isEmpty());

        char[] chArray={'H',' ','l','l','o'};
        String str2=new String(chArray);
        System.out.println(str2.toUpperCase());
    }
}
