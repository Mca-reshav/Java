class Person{
    String name;

    Person(){
        System.out.println("Person-Default Constructor");
    }
}
public class DefaultConstructor {
    public static void main(String[] args){
        Person per=new Person(); //It has no need to call, just create its object instance.
    }
}
