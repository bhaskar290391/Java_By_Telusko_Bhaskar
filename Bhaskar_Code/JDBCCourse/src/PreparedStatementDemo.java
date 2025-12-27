import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {
    public static void main() throws  Exception{

        Class.forName("org.postgresql.Driver");

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="1111";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established");
        String insert="insert into student values (?,?,?)";
        PreparedStatement st=con.prepareStatement(insert);
        st.setInt(1,29);
        st.setString(2,"Shetty");
        st.setInt(3,90);
        st.executeUpdate();

        con.close();
        System.out.println("Connection Closed");

    }
}
