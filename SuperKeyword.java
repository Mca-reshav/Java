//Super keyword: To use methods of parent class inside a method of child class
public class SuperKeyword {
    public static void main(String[] args) {

        System.out.println("Super keyword");
        Puppy p =new Puppy();
        p.getPuppyData();
    }
}
class Dog{
    String name="Husky";
    void getDogData(){
        System.out.println("This is a Dog");
    }
}
class Puppy extends Dog{
    void getPuppyData(){
       // Dog d=new Dog();
        //d.getDogData();       in this way you are getting the method of parent class

        super.getDogData();
        this.getDogData();
        //this.getPuppyData();  recursion
        System.out.println("Dog name is "+this.name);
    }
}