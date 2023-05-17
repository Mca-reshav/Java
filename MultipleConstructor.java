public class MultipleConstructor {
    public static void main(String[] args) {
       People p1=new People();
       People p2=new People("Ramesh");
       People p3=new People("Suresh",25);
    }
}
class People{
    People(){
        System.out.println("People Constructor");
    }
    People(String name){
        System.out.println(name+" Constructor");
    }
    People(String name,int age){
        System.out.println("Constructor name is "+name+" and age is "+age);
    }
}