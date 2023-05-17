//Object: Any entity that has state and behaviour
//OOP: It is a computer programming model that organizes software design around data or objects,
//rather than functions and logic.

class User{
    public String name="Ramesh";
    public int age=25;
    public String address="Delhi";

    public void details(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }
}
class Employee{
    String name="Suresh";
    String getName(){
        return this.name;
    }
    void show(){
        System.out.println(this.name);
    }
}
public class OOP {
    public static void main(String[] args){
        System.out.println("OOP");
        Employee emp1=new Employee();
        System.out.println(emp1.name);

    }
}
