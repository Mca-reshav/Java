package FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try{
            File myFile=new File("Files/apple5.txt");
            if(myFile.exists()){
                myFile.delete();
                System.out.println("file is deleted");
            }else{
                System.out.println("No Record Found");
            }

        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
