public class Inheritance {
    public static void main(String[] args) {
        child c=new child();
        c.getData();

    }
}
class parent{
    String name="Java";
    void getData(){
        System.out.println(this.name);
    }
}
class child extends parent{

}