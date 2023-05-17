public class ClassExample {
        public static void main(String[] args){
            System.out.println("Main CLass");
            Stud s=new Stud();
            System.out.println(s.sDisplay());
            s.sPrint();
            System.out.println(s.sname);
            System.out.println(s.age);

            Teacher t=new Teacher();
            System.out.println(t.tDisplay());
            System.out.println(t.tname);
            System.out.println(t.age);

            String msg="Attention Students";    //dynamically passing the message to teacher
            t.tPrint(msg);
        }
    }
    class Stud{
        String sname="Ram";
        int age=25;

        String sDisplay(){
            return "Hello";
        }
        void sPrint(){
            System.out.println("Student");
        }
    }
    class Teacher{
        String tname="Shyam";
        int age=45;

        String tDisplay(){
            return "Hello Teacher";
        }
        void tPrint(String message){    //accepting the message passed from main
            System.out.println(message);
        }
    }
