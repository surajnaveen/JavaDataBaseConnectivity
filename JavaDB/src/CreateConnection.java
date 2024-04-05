import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    private String url = "Jdbc:mysql://localhost:3306/student";
    private String user = "root";
    private String password = "";

    private Connection connection = null;

    private void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Success start");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection setConnection(){
        getConnection();
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Success connection");
            return connection;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
