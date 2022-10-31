// Import the required packages. At deployment time, 
// the JDBC driver-specific class that implements
// DataSource must be imported.
import java.sql.*;
import javax.naming.*;
import com.ibm.db2.jdbc.app.UDBDataSource;

public class UDBDataSourceBind2
{
    public static void main(java.lang.String[] args) 
    throws Exception
    {
        // Create a new UDBDataSource object and give it 
        // a description.
        UDBDataSource ds = new UDBDataSource();
        ds.setDescription("A simple UDBDataSource "  +
                          "with cujo as the default " +
                          "profile to connect with.");
        
        // Provide a user ID and password to be used for 
        // connection requests.
        ds.setUser("cujo");
        ds.setPassword("newtiger");
           ds.setUser("cujo2");
        ds.setPassword("newtiger2");
           ds.setUser("cujo3");
        ds.setPassword("newtiger33");

        // Retrieve a JNDI context. The context serves
        // as the root for where objects are bound or
        // found in JNDI.
        Context ctx = new InitialContext();

        // Bind the newly created UDBDataSource object 
        // to the JNDI directory service, giving it a name
        // that can be used to look up this object again
        // at a later time.
        ctx.rebind("SimpleDS2", ds);
    }
}
