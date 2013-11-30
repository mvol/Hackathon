import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 29.11.13
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class HackathonTest {

    private String dbms = "mysql";
    private Object userName = "jssm";
    private Object password = "jssm1234";
    private Object serverName = "localhost";
    private Object portNumber = 3306;
    private Object dbName = "jssm";

    public static void main(String[] args) throws SQLException {
        HackathonTest ht = new HackathonTest();

        ht.getConnection();
    }

    public Connection getConnection() throws SQLException {


        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        if (this.dbms.equals("mysql")) {
            conn = DriverManager.getConnection(
                    "jdbc:" + this.dbms + "://" +
                            this.serverName +
                            ":" + this.portNumber + "/",
                    connectionProps);
        } else if (this.dbms.equals("derby")) {
            conn = DriverManager.getConnection(
                    "jdbc:" + this.dbms + ":" +
                            this.dbName +
                            ";create=true",
                    connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }





}
