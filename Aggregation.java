//Aggregation: when an object A contains a reference to another object B
//we can say object A has a HAS-A relationship with object B
public class Aggregation {
    public static void main(String[] args) {
       // Emp e=new Emp("Peter","F20","New town","West Bengal","India");
        //e.displayDetails();
        Address a=new Address("F20","New town","West Bengal","India");
        Emp e=new Emp("Bruce",a);
        e.displayDetails();
    }
}
/*Normal Constructor
class Emp{
    String name;
    String hno;
    String city;
    String state;
    String country;

    public Emp(String name, String hno,String city, String state, String country){
        this.name=name;
        this.hno=hno;
        this.city=city;
        this.state=state;
        this.country=country;
        //here you can see that re-writing same things creating unnecessary burden
    }
    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.hno+" "+this.city+ " "+this.state+" "+this.country);
    }
}*/

//aggregation
class Address{
    String hno, city, state, country;
    public Address(String hno,String city, String state, String country){
        this.hno=hno;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class Emp{
    String name;
    Address address;
    public Emp(String name, Address address){
        this.name=name;
        this.address=address;
    }
    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(address.hno+ " "+address.city+" "+address.state+" "+address.country);
    }
}


/*
* public class Trying {
    public static void main(String[] args) {
        System.out.println("aggregation");
        Marks m=new Marks(80,75,85);
        Studs s=new Studs("Ramesh",m);
    }
}
class Marks{
    int sciMarks, mathsMarks, engMarks;
    public Marks(int sciMarks, int mathsMarks, int engMarks){
        this.sciMarks=sciMarks;
        this.mathsMarks=mathsMarks;
        this.engMarks=engMarks;
    }

}
class Studs{
    String name;
    Marks marks;
    public Studs(String name, Marks marks){
        this.name=name;
        this.marks=marks;
        int score= (marks.sciMarks+ marks.mathsMarks+ marks.engMarks)/3;
        System.out.println("Name:"+this.name+" Scored:"+score+"%");
    }
}
* */