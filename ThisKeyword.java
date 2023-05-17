//This keyword: This refers to the current class. It calls current class methods and variables,
//also call the current class constructor. This will not work in static context.
public class ThisKeyword {
    public static void main(String[] args) {
        ThisPerson tp=new ThisPerson();
        tp.getInfo();
    }
}
class ThisPerson{
    String name="Java";
    String name2="SpringBoot";  //Static
    void getName(){
        System.out.println(this.name);
    }
     ThisPerson(){
        this.getName();
    }
    void getInfo(){  //You cannot use this keyword with static method
                     //But you can use static variable in non-static method using this keyword
        System.out.println(this.name2);
    }

}