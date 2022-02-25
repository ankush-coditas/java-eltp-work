package feb25;

import java.sql.*;

public class SavePointDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac","root","root");
            Statement statement  = con.createStatement();
            String query = "delete from fruit where id =3";
            con.setAutoCommit(false);
            Savepoint spn = con.setSavepoint();
             statement.executeUpdate(query);

           con.rollback(spn);
            con.commit();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
/**
 * before roll back:
 * +----+--------+
 * | id | name   |
 * +----+--------+
 * |  2 | mango  |
 * |  3 | orange |
 * |  4 | kiwi   |
 *
 *    +----+--------+
 *    | id | name   |
 *    +----+--------+
 *    |  1 | Apple  |
 *    |  2 | mango  |
 *    |  3 | orange |
 *    |  4 | kiwi   |
 *
 *
 * after roll back:
 *
 */
