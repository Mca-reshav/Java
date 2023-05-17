/*Static keyword in java is used for memory management,
 we can apply static keyword with variables, methods, blocks and nested class.*/
/*
public class Static {
    public static void main(String[] args){
        UserData u1=new UserData();
        UserData u2=new UserData();
        System.out.println(u1.data+ " "+u2.data2);
    }
}
class UserData{
    public int data=10;
    public int data2=20;
}

 */

class Static{
    public static void main(String[] args){
        UserData u1=new UserData();
        UserData u2=new UserData();
        u1.getCount();
        u2.getCount();
    }
}
class UserData{
    int counter=0;               //O/P: 1 1
    //static int counter=0;      //O/P: 1 2
    void getCount(){
        counter++;
        System.out.println(counter);
    }
}