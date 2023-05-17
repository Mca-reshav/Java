public class Swapping {
    public static void main(String[] args){
        int x=10;
        int y=20;

        System.out.println(x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);

        int temp;
        int a=30;
        int b=40;

        System.out.println(a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
