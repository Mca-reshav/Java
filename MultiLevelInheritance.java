public class MultiLevelInheritance {
    public static void main(String[] args) {
        District d=new District();
        d.show();
    }
}
class Country{  //parent cannot inherit properties of child
    String cName="India";
}
class State extends Country{
    String sName="Delhi";
}
class District extends State{
    String dName="South Delhi";
    void show(){
        System.out.println(dName+" of "+this.sName+" in "+this.cName);
    }
}
