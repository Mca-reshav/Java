//Static class: similar like nested class,
// but it can be accessible outside the parent class i.e., main function
public class StaticClass {
    public static void main(String[] args) {
        Hostel h= new Hostel();
        h.getDetails();
        Hostel.Mess hm=new Hostel.Mess();//here you can directly access the nested class
        hm.getMessDetails();             // without creating a method inside the parent
    }
}
class Hostel{
    static String hostelName="Topaz";   //static
    static class Mess{  //static
        void getMessDetails(){
            System.out.println("This is mess of "+hostelName);  //you cannot access hostelName without using static keyword
        }
    }
    void getDetails(){  //you can use this method when you are not using static class
        Mess m=new Mess();
        m.getMessDetails();
    }
}