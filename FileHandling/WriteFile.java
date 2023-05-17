package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)throws IOException {
        try{
            FileWriter myFile=new FileWriter("apple2.txt");
            myFile.write("This is a sample file");
            myFile.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }
}
