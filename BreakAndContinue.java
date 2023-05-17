public class BreakAndContinue {
        public static void main(String[] args){
            Statements s=new Statements();
            System.out.println("Break Statement");
            s.breakStatement();
            System.out.println(" ");
            System.out.println("Continue Statement");
            s.continueStatement();
        }
    }
    class Statements{
        void breakStatement(){
            for(int j=1; j<=10;j++){
                if(j==5){
                    break;
                }
                System.out.print(j+" ");
            }
        }
        void continueStatement(){
            for(int i=1; i<=10;i++){
                if(i==5){
                    continue;
                }
                System.out.print(i+" ");
            }

        }

    }
