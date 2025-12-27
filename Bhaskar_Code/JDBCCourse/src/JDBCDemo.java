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

        String sql="select * from student ";

        ResultSet rs=st.executeQuery(sql);

        while(rs.next()){
            System.out.print(rs.getInt(1)+" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.println(rs.getInt(3));
        }
        con.close();


    }
}
