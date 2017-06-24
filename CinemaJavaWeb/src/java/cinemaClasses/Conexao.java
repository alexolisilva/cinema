
package cinemaClasses;

/**
 *
 * @author aos
 */
import java.sql.*;


public class Conexao {
    
    private Statement stmt = null;
    private Connection conn = null;
    
    
    public Connection getConnection() throws ClassNotFoundException{
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                    "databaseName=cinema;user=sa;password=123@senha");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }    
        }
}
