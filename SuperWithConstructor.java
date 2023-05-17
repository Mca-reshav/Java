//If you want to call constructor of parent class inside a child class then,
// you have to create and call inside a constructor of child class.
public class SuperWithConstructor {
    public static void main(String[] args) {
        System.out.println("Super keyword with constructor");
        Cat c=new Cat();
        c.doSomething();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
    int age=5;
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Cat extends Animal{
    Cat(){
        //this(); this will not work
        super();
    }
    void doSomething(){
        super.sleep();
        this.sleep();
        System.out.println(super.age+" "+this.age);
    }
}
