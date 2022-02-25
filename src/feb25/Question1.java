package feb25;

import java.sql.*;

public class Question1 {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac","root","root");
           st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from teaacher");
            rs.absolute(1);
            String s = rs.getString(2);
            rs.updateString(2,"prof");
            rs.updateRow();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
