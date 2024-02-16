import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo{
    public static void main(String [] args){
        try{
            //Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establish The connection
            String url="jdbc:mysql://localhost:3306/java";
            Connection conn= DriverManager.getConnection(url,"root","Password@123");
            System.out.println("connection established");

            // create a satament
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM login");
            System.out.println("username\tPassword");
            while(rs.next()){
                while (rs.next()) {
                    //printing out the results
                    System.out.println(rs.getString("uname") + "\t\t" + rs.getString("pass"));
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}