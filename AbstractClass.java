//Abstract class: It is used for making methods without and with the body
//Object cannot be created with abstract class
//An abstract method must be contained inside an abstract class but, reverse is not mandatory.
public class AbstractClass {
    public static void main(String[] args) {
       OneUI o=new OneUI();
       o.customUI();
       o.stockAndroidUI();
       //StockUI s=new StockUI(); //You cannot create object to instantiate an abstract class.

    }
}
abstract class StockUI{
    void stockAndroidUI(){
        System.out.println("You will get stock android features");
    }
    abstract void customUI();
}
class OneUI extends StockUI{
    void customUI(){
        System.out.println("You will get extra features of custom ui");
    }
}