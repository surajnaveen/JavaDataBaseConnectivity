import java.sql.Connection;
import java.sql.Statement;

public class DeleteData {
    private Connection connection = null;
    private String query = "DELETE FROM basicdata WHERE name = 'Suraj';";

    public void startDelete(){
        try{
            CreateConnection link = new CreateConnection();
            connection = link.setConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
