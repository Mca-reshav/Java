import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class dbConnectWithMySQL {
    public static void main(String[] args) {
        getConnection();
       // getData();
        //insertData();
        //deleteData();
        //updateData();
        getRecordWithInput();
    }
    public static Connection getConnection(){
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/my_schema";
            String userName="root";
            String password="rEshavkumar6$";
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(databaseUrl,userName,password);
           // System.out.println("Database connected");
            return conn;
        }catch(Exception e){
            System.out.println("Some Error:"+e);
        }
        return null;
    }
    public static void getData(){
        try{
            Statement stmt=getConnection().createStatement();
            ResultSet rs=stmt.executeQuery("select * from my_first_table");
            while(rs.next()){
                System.out.print(rs.getString("name")+" | ");
                System.out.print(rs.getString("address")+" | ");
                System.out.print(rs.getString("age")+" | ");
                System.out.println(rs.getString("company"));
            }
        }catch (Exception e){
            System.out.println("Error occured in getting the data from database"+e);
        }
    }
    public static void insertData(){
        try{
            Statement stmt=getConnection().createStatement();
            int rs=stmt.executeUpdate("insert into my_first_table (name,address,age,company) values ('Seeta','Pune',22,'Larsen & Turbo')");
            System.out.println(rs);
            if(rs==1){
                System.out.println("Data is inserted");
            }else{
                System.out.println("Some error");
            }
        }catch (Exception e){
            System.out.println("Error occured in getting the data from database"+e);
        }
    }
    public static void deleteData(){
        try{
            Statement stmt=getConnection().createStatement();
            int rs=stmt.executeUpdate("delete from my_first_table where name='Dinesh'");
            System.out.println(rs);
            if(rs==1){
                System.out.println("Data is deleted");
            }else{
                System.out.println("Some error");
            }
        }catch (Exception e){
            System.out.println("Error occured in getting the data from database"+e);
        }
    }
    public static void updateData(){
        try{
            Statement stmt=getConnection().createStatement();
            int rs=stmt.executeUpdate("update my_first_table set name='Sita' where name='Seeta'");
            System.out.println(rs);
            if(rs==1){
                System.out.println("Data is updated");
            }else{
                System.out.println("Some error");
            }
        }catch (Exception e){
            System.out.println("Error occured in getting the data from database"+e);
        }
    }
    public static void getRecordWithInput(){
        try{
            //System.out.println("Enter the age");
            System.out.println("Enter the name");
            Scanner scan=new Scanner(System.in);
            //int age= scan.nextInt();
            String name=scan.next();
            Statement stmt=getConnection().createStatement();
            //ResultSet rs=stmt.executeQuery("select * from my_first_table where age="+age);
            ResultSet rs=stmt.executeQuery("select * from my_first_table where name='"+name.toLowerCase()+"' ");
            while(rs.next()){
                System.out.print(rs.getString("name")+" | ");
                System.out.print(rs.getString("address")+" | ");
                System.out.print(rs.getString("age")+" | ");
                System.out.println(rs.getString("company"));
            }
        }catch(Exception e){
            System.out.println("Some error:"+e);
        }
    }
}