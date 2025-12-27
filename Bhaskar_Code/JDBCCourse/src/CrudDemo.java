import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudDemo {
    public static void main() throws  Exception{

        Class.forName("org.postgresql.Driver");

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="1111";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established");
        Statement st=con.createStatement();

       // String insert="insert into student values (5,'John',86)";
        //  String update ="update student set sname='Max' where sid=5";
        String delete="delete from student where sid=5";
        st.execute(delete);

        con.close();
        System.out.println("Connection Closed");

    }
}
