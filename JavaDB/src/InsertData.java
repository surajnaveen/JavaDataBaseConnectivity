import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
    private Connection connection = null;
    private CreateConnection link = new CreateConnection();

    private String query = "INSERT INTO basicdata (name,address) VALUE ('Naveen','Colombo');";

    public void setData() {
        try{
           connection = link.setConnection();
           Statement statement = connection.createStatement();
           statement.executeUpdate(query);
           System.out.println("Data insert successfully");
        }
        catch (Exception ee){
            System.out.println("Something wrong with insertion");
        }
    }
}
