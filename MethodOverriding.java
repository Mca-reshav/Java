//Method Overriding: If subclass(child class) has the same method as declared in the parent class
//the method must have the same name and parameters as in the parent class
//there must be an IS-A relationship(inheritance)
public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        Emps e=new Emps();
        e.getLogin();
        e.logout();
    }
}
class Users{
    void getLogin(){
        System.out.println("User Login");
    }
    void logout(){
        System.out.println("Logout");
    }
}
class Emps extends Users{
    void getLogin(){
        System.out.println("Emp Login");
    }
}
