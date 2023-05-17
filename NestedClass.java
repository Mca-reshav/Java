//Nested class: It has limited access, only the parent class
public class NestedClass {
    public static void main(String[] args) {
        College c=new College();
        c.getDetails();

    }
}
class College{
    class student{
        void getStudentDetails(){
            System.out.println("I am a student");
        }
    }
    void getDetails(){
        student s=new student();
        s.getStudentDetails();
    }
}