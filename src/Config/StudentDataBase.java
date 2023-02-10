package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDataBase {
    public static String url = "jdbc:mysql://localhost:3306/qlsv";
    public static String user="root";
    public static String password ="";
    public static Connection Connection2(){
        Connection connection2 = null;
        try {
            connection2 = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            System.out.println("ERROR!");
        }
        return connection2;
    }
}
