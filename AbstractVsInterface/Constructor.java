package AbstractVsInterface;

public class Constructor {
    public static void main(String[] args) {
        System.out.println("Constructor");
    }
}
abstract class AbsA{
    AbsA(){

    }
}
interface IntA{
    //This will not work as interface has no body ->IntA(){}
}