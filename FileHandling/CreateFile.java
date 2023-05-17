package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile=new File("apple.txt");
        if(myFile.createNewFile()){
            System.out.println("File has created");
        }else{
            System.out.println("File already exists");
        }
    }
}
