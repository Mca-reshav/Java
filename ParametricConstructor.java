//Parametric Constructor Method 1

/*class Student{
    String name;
    Student(String data){
           this.name=data;
    }
}
public class ParametricConstructor {
    public static void main(String[] args){
           String name="Ramesh";
           Student stud=new Student(name);
           System.out.println(stud.name);
    }
}*/


//Parametric Constructor Method 2
class Student{
    Student(String data){
        System.out.println(data);
    }
}
public class ParametricConstructor{
    public static void main(String[] args){
        Student stud1=new Student("Ramesh");
        Student stud2=new Student("Suresh");
    }
}
