package FileHandling;

import java.io.FileWriter;

public class WriteMultipleFiles {
    public static void main(String[] args) {
        try{
            for(int i=0;i<=10;i++){
                String fileName="Files/apple"+i+".txt";
                FileWriter writer=new FileWriter(fileName);
                writer.write("this is dummy file"+fileName);
                writer.close();
                System.out.println(fileName+"created");
            }
        }catch(Exception err){
            System.out.println("Error: "+err);
        }
    }
}
