import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by sebastian on 18.06.2016.
 */
public class DB {
    public static void insert(double value) {

        try {
            // 1. load driver
            Class.forName("org.postgresql.Driver"); //se face automat in versiuni mai noi, e pus doar pentru intelegere

            // 2. define connection params to db
            final String URL = "jdbc:postgresql://54.93.65.5:5432/4_sebastian"; //adresa, IP:PORT, Data base
            final String USERNAME = "fasttrackit_dev";
            final String PASSWORD = "fasttrackit_dev";

            // 3. obtain a connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 4. create a query statement
            PreparedStatement pSt = conn.prepareStatement("INSERT INTO numbers (rezultate) VALUES (?)");
            pSt.setDouble(1, value);


            // 5. execute a prepared statement
            int rowsInserted = pSt.executeUpdate();

            // 6. close the objects
            pSt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//com
