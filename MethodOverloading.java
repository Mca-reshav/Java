//Method overloading: more than one function/method having same name but different arguments and data types
//similar with constructor
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Employ e=new Employ();
        Employ e1=new Employ("Java");
        e.getData();
        e.getData("Hulk");
        e1.getData("Captain","America");
        e1.getAge(25);
        e1.getAge("22");
    }
}
class Employ{
    Employ(){
        System.out.println("Default Constructor");
    }
    Employ(String data){
        System.out.println(data+" "+"Parametric Constructor");
    }
    void getData(){
        System.out.println("Get name method without argument");
    }
    void getData(String name){
        System.out.println(name+" "+"Get name method with argument");
    }
    void getData(String fname,String lname){
        System.out.println(fname+lname);
    }
    void getAge(int age){
        System.out.println("Int age"+age);
    }
    void getAge(String age){
        System.out.println("String age"+age);
    }
}
