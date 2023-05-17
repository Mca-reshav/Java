

//Exception: unexpected result
public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
        int a=10;
        try{
            System.out.println(a/0);
        }catch (Exception err){
            System.out.println("Error "+err);
        }finally{
            System.out.println("Run in both cases");
        }
        System.out.println("hello msg after tryCatch block");
    }
}
