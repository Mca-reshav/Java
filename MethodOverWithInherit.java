

/*
Method Overloading vs MethodOverriding
1.Inheritance   It will work with and without       Only with inheritance
2.function name       same,                         same
3.parameter           different                     same
* */
public class MethodOverWithInherit {
    public static void main(String[] args) {
        System.out.println("Method overloading with inheritance");
        EmpLogin e=new EmpLogin();
        e.getLogin("Ramesh");
        e.getLogin(123);
    }
}
class UserLogin{
    void getLogin(String name){
        System.out.println(name+ " is logged in");
    }
}
class EmpLogin extends UserLogin{
    void getLogin(int password){
        System.out.println(password+" is password");
    }
}