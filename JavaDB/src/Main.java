import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String query = "select * from basicdata;";
        try{
            CreateConnection link = new CreateConnection();
            connection = link.setConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String name = result.getString(2);
                String address = result.getString(3);

                System.out.println("Name: "+ name + " Address: "+address);
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

        //InsertData insert = new InsertData();
        //insert.setData();

        UpdateData update = new UpdateData();
        update.setData();
    }
}