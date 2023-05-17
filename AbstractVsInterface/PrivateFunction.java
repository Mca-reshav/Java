package AbstractVsInterface;

public class PrivateFunction {
    public static void main(String[] args) {
        System.out.println("Private function");
    }
}
abstract class abA{
    private void test(){
        System.out.println("Hello abstract");
    }
}
interface inA{
    public void test();
    //private void test2(); this will not work
}
