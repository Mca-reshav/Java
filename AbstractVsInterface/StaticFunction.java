package AbstractVsInterface;

public class StaticFunction {
    public static void main(String[] args) {
        System.out.println("Static Function");
    }
}
abstract class abstA{
    static void test(){
        System.out.println("Hello");
    }
}
//This will not work with interface as it has no body
