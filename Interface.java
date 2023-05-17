//Interface: An interface in java is a blueprint of a class.
// It has static constants and abstract method,Functions without body
//Always use public scope with implement
//It is possible to use a method that is not declared in interface.
public class Interface {
    public static void main(String[] args) {
        CarDriving cd=new CarDriving();
        System.out.println("Car name is "+cd.name);
        cd.startEngine();
        cd.applyClutch();
        cd.changeGear();
        cd.accelerate();    //it is not declared in interface but, we are using it
    }
}
interface driving{
    String name="Car";  //it will get override with child class name variable.
    void startEngine();
    void applyClutch();
    void changeGear();
}
class CarDriving implements driving{
    String name="Tata Harrier"; //this will get more priority than the previous one name[9], if you declare here.
   public void startEngine(){
        System.out.println("Engine is started");
    }
    public void applyClutch(){
        System.out.println("Clutch is applied");
    }
    public void changeGear(){
        System.out.println("Gear is changed");
    }
    public void accelerate(){
        System.out.println("Now, slowly accelerate the car");
    }
}