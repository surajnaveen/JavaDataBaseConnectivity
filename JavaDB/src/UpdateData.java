import java.sql.Connection;
import java.sql.Statement;

public class UpdateData {
    private Connection connection = null;
    private CreateConnection link = new CreateConnection();

    private String query = "UPDATE basicdata SET address = 'Kegalle' WHERE address = 'Colombo';";
    public void setData(){
        try{
            connection = link.setConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }

}
