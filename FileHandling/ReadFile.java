package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args)throws IOException {
        try{
            File myFile=new File("apple2.txt");
            Scanner read=new Scanner(myFile);
            while(read.hasNextLine()){ //to check it is empty or not
               String data=read.nextLine();  //to read
                System.out.println(data);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
