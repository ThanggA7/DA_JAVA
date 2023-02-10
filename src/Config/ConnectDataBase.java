package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDataBase {
        public static String url = "jdbc:mysql://localhost:3306/login";
        public static String user="root";
        public static String password ="";
        public static Connection Connection(){
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url,user,password);
            }catch (Exception e){
                System.out.println("ERROR!");
            }
            return connection;
        }
    }
