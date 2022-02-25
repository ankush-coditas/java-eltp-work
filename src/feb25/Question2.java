package feb25;

import java.sql.*;

public class Question2 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac","root","root");
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from color ");

            con.setAutoCommit(false);
            st.executeUpdate("insert into color values(2,'orange')");
            con.commit();


        } catch (Exception e) {
            con.rollback();
            System.out.println("roll back execute");
            e.printStackTrace();
        }
    }
}
