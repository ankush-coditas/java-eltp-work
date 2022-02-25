package feb25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImgStorage {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement  pst ;
        FileInputStream fis;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac","root","root");
            pst = con.prepareStatement("insert into img values(?,?)");
            pst.setInt(1,1);
            File f = new File("src/feb25/pic.png");
               fis = new FileInputStream(f);
               pst.setBinaryStream(2,fis,(int)f.length());
               int count = pst.executeUpdate();
            System.out.println(count);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
