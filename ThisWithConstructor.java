public class ThisWithConstructor {
    public static void main(String[] args) {
        ThisPersons tp=new ThisPersons("Hello");

    }
}
class ThisPersons{
    static String name="Java";

    void getData(){
        System.out.println(this.name);
    }
    ThisPersons(){
        this.getData();
    }
    ThisPersons(String data){
        this(); //this will automatically refer to the default constructor
    }
}
