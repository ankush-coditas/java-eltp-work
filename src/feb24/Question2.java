package feb24;

import java.sql.*;

public class Question2 {
    public static void main(String[] args) {
        //load the class
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac", "root", "root");
            Statement st = con.createStatement();
          //  st.execute("alter table student add gender varchar(20)");
            System.out.println("new coloumn is added gender ");

            ResultSet rs = st.executeQuery("select * from student where year = 3 and pr>70");
            System.out.println("result set "+rs);
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+" "+rs.getString(5));
            }
            System.out.println("student beten id 1 to 10");
            ResultSet rs1 = st.executeQuery("select * from student where id >0 and id<11");
            System.out.println("result set "+rs);
            while (rs1.next()){
                System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4)+" "+" "+rs1.getString(5));
            }
           /*
            st.executeUpdate("insert into student values (6,'karuna',2,78,'akola','F')");
            st.executeUpdate("insert into student values (7,'kareena',4,98,'mumbai','F')");
            st.executeUpdate("insert into student values (6,'kriti',3,80,'pune','F')");
*/
            System.out.println("three record is added");
          // st.executeUpdate("update student set name = concat('Mr ',name) where gender ='M'");
           // st.executeUpdate("update student set name = concat('Ms ',name) where gender ='F'");
            st.execute("delete from student  where year =4");
            System.out.println("deleted succes fully");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/**
 * Data table:
 * +----+----------+------+----+----------+--------+
 * | id | name     | year | pr | city     | gender |
 * +----+----------+------+----+----------+--------+
 * |  2 | Mr akash  |    3 | 97 | malkapur | M      |
 * |  3 | Mr aman   |    2 | 60 | pune     | M      |
 * |  5 | Mr arjun  |    1 | 89 | shegaon  | M      |
 * |  6 | M skaruna |    2 | 78 | akola    | F      |
 * |  6 | Ms kriti  |    3 | 80 | pune     | F      |
 * +----+----------+------+----+----------+--------+
 */