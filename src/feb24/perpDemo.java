package feb24;

import java.sql.*;

public class perpDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into fruit values(?,?)");
            pst.setInt(1,4);
            pst.setString(2,"kiwi");
            pst.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
