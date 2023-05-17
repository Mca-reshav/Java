package AbstractVsInterface;

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
    }
}
abstract class AbstractA{

}
abstract class AbstractB{

}
//This will throw an error -> class child extends AbstractA,AbstractB{}

interface InterfaceA{

}
interface InterfaceB{

}
class child implements InterfaceA,InterfaceB{
    //It will work
}
