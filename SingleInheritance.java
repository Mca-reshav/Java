
public class SingleInheritance {
    public static void main(String[] args) {
        Engine e=new Engine();
        e.start();
        e.display();//you can only access this private method by passing it to another method
        // otherwise you cannot access a private method outside its parent class

    }
}
class Car{
    String name="Tata Safari";

    void start(){
        System.out.println(name+" is started now");
    }
    //By default, scope is public
    private void coldStart(){
        System.out.println(this.name+" is cold started ");
    }
    void display(){
        this.coldStart();
    }
}
class Engine extends Car{

}
