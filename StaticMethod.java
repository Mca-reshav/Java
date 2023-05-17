//Static method: No need to call object for method, It is associated with class not object
public class StaticMethod{
    public static void main(String[] args) {
        Persons p=new Persons();
        p.getData();    //you cannot use test() method here as it is a static method
    }
}
class Persons{
    void getData(){
        test();
    }
     static void test(){
        System.out.println("Static test method");
    }
}