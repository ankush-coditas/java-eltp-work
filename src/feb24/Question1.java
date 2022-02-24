package feb24;

import java.sql.*;
import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            //1
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
            System.out.println("Connected");

           Statement stm = con.createStatement();

            stm.executeUpdate("INSERT INTO emp VALUES (1, 'Ankush', '3jan', 3,30000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (2, 'Aman', '7jan', 0,3000,'left')");
            stm.executeUpdate("INSERT INTO emp VALUES (3, 'sam', '24 feb', 5,500000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (5, 'ram', '8jan', 2,40000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (6, 'himal', '3jan', 1,30000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (7, 'kran', '3jan', 1,30000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (8, 'rohit', '3jan',3,66000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (9, 'ansh ', '3jan',2,777000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (10, 'anup', '3jan', 2,90000,'working')");
            stm.executeUpdate("INSERT INTO emp VALUES (11, 'yash', '3jan', 3,30000,'working')");


            rs=stm.executeQuery("select * from emp");//100
            System.out.println("Data of table");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                        +rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(2));
            }
            System.out.println("==============================================================");
             stm.execute("alter table emp add city varchar(20)");
            System.out.println("city cloumn add");

              stm.executeUpdate(" update emp set city = 'pune' where id = 1");
            stm.executeUpdate(" update emp set city = 'pune' where id = 2");
            stm.executeUpdate(" update emp set city = 'nagpur' where id = 3");
            stm.executeUpdate(" update emp set city = 'shegaon' where id = 4");
            stm.executeUpdate(" update emp set city = 'amravati' where id = 6");
            stm.executeUpdate(" update emp set city = 'buldhana' where id = 7");
            stm.executeUpdate(" update emp set city = 'pune' where id = 8");
            stm.executeUpdate(" update emp set city = 'pune' where id = 9");
            System.out.println("Record updated");

            rs=stm.executeQuery("select * from emp where city= 'pune' and salary>20000");//100
            System.out.println("Data of  Employee salary greater than 20000");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                        +rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(2));
            }
            System.out.println("===========================================");
            stm.executeUpdate (" update emp set salary = salary+1000  where exp = 3");
            System.out.println("Slary is updated of employe having exp greter than 3");
            stm.execute("delete from emp where status ='left'");
            System.out.println("the employe is deleted who has left the organization");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
/**
 * datatable
 * +------+--------+--------+------+--------+---------+----------+
 * | id   | name   | doj    | exp  | salary | status  | city     |
 * +------+--------+--------+------+--------+---------+----------+
 * |    1 | Ankush | 3jan   |    3 |  32000 | working | pune     |
 * |    3 | sam    | 24 feb |    5 | 500000 | working | nagpur   |
 * |    5 | ram    | 8jan   |    2 |  40000 | working | NULL     |
 * |    6 | himal  | 3jan   |    1 |  30000 | working | amravati |
 * |    7 | kran   | 3jan   |    1 |  30000 | working | buldhana |
 * |    8 | rohit  | 3jan   |    3 |  68000 | working | pune     |
 * |    9 | ansh   | 3jan   |    2 | 777000 | working | pune     |
 * |   10 | anup   | 3jan   |    2 |  90000 | working | NULL     |
 * |   11 | yash   | 3jan   |    3 |  32000 | working | NULL     |

 */