import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost5432/demo";
        Connection con = null;

        int id = 1;
        String name = "Ashoka";
        int hour = 5;
        
        String sql = "insert into smoking(Id, name, hour)" + "values(" + id + ", " + name + ", " + hour + ")";

        try{
            con = DriverManager.getConnection(url , "postgresql", "jawed@quz75528");
            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}