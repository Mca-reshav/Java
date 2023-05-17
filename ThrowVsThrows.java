//Throw: when you forcefully want to push the non-error code into catch block.
//Throws: just after function signature
public class ThrowVsThrows {
    public static void main(String[] args) {
        System.out.println("Throw vs Throws");
       /* try{
            int a=10;
            System.out.println(a/2);
            if(a==10){
                System.out.println("Hello");
                throw new ArithmeticException("Test");
            }
        }catch(ArithmeticException err){
            System.out.println("Some Error "+err);
        }*/

        try{
            checkAge();

        }catch(Exception err){
            System.out.println("Error "+err);
        }
    }
    public static void checkAge() throws ArithmeticException{
        System.out.println(18/0);
    }
}
