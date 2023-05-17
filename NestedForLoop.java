public class NestedForLoop {
    public static void main(String[] args){
        Pattern p=new Pattern();
        p.display1();
        p.display2();
        p.display3();
    }
}
class Pattern {
    void display1() {
        System.out.println("Printing star pattern 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");

        }
    }
    void display2(){
        System.out.println("Printing star pattern 2");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");

        }
    }
    void display3(){
        System.out.println("Printing star pattern 3");
        for(int i=6;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }
}
