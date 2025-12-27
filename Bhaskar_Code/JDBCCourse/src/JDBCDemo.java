import java.sql.*;

public class JdbcDemo {
    public static void main() throws  Exception{

        Class.forName("org.postgresql.Driver");

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="1111";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established");
        Statement st=con.createStatement();

        String sql="select sname from student where sid=1";

        ResultSet rs=st.executeQuery(sql);

        rs.next();

        String sname =rs.getString("sname");

        System.out.println("The student name is "+ sname);

        con.close();


    }
}
