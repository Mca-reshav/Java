//Covariant: Before java 5, it is not possible to override the method that have different return type,
// now it is possible
public class Covariant {
    public static void main(String[] args) {
        Client c=new Client();
        c.login();
    }
}
class UserClass{
    UserClass login(){
        System.out.println("Login of user");
        return this;
    }
}
class Client extends UserClass{
    Client login(){
        System.out.println("Client login");
        return this;
    }
}