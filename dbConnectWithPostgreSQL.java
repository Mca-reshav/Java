import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnectWithPostgreSQL {
        public static Connection getConnection(){
            try {
                String Driver="org.postgresql.Driver";
                String dbUrl="jdbc:postgresql://localhost:5432/practice";
                String username="postgres";
                String pass="1234";
                Class.forName(Driver);
                Connection conn= DriverManager.getConnection(dbUrl,username,pass);
                System.out.println("Database Successfully Connected");
                return conn;
            }
            catch (Exception e){
                System.out.println("Some error: "+e);
            }
            return null;

        }
        public static void getData(){
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Please Mention the Name of Person");
                String uName= sc.next();
                Statement statement=getConnection().createStatement();
                ResultSet result=statement.executeQuery("select * from customer where name = '"+uName.toLowerCase()+"' ");
                while (result.next()){
                    System.out.println("The Person id is: "+result.getString("custid"));
                    System.out.println("The Person name is: "+result.getString("name"));
                    System.out.println("The Person email is: "+result.getString("email"));
                    System.out.println("The Person address is: "+result.getString("address"));
                }

            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void insData(){
            while(true){
                try {
                    Scanner scanner=new Scanner(System.in);
                    System.out.print("Please Mention The Id Of Person: ");
                    int uid= scanner.nextInt();
                    System.out.print("Please Mention The Name of The person: ");
                    String uname= scanner.next();
                    System.out.print("Please Enter The Email Of Person: ");
                    String umail= scanner.next();
                    System.out.print("Enter Your Destination: ");
                    String uadd=scanner.next();
                    Statement statement= getConnection().createStatement();
                    int result=statement.executeUpdate("Insert into customer (custid,name,email,address) values("+uid+",'"+uname.toLowerCase()+"','"+umail+"','"+uadd+"')");
                    if(result==1){
                        System.out.println("Successfully Updated");
                    }
                    else {
                        System.out.println("Not Updated");
                    }
                }catch (Exception e){
                    System.out.println("Some error"+e);
                }
            }}

        public static void main(String[] args) {
            getConnection();
            // getData();
            insData();
        }
}
