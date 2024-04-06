import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    Connection connection = null;
    String query = "select * from basicdata;";
    CreateConnection link = new CreateConnection();
    public void readMethod(){
        try{
            connection = link.setConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String name = result.getString(2);
                String address = result.getString(3);
                System.out.println("Name: "+name+" Address: "+address);
            }

        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }

}
