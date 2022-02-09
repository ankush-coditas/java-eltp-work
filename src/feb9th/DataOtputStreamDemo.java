package feb9th;
//allows an application to write primitive Java data types to the output stream
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOtputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream( "src/feb9th/file_out.txt");
        DataOutputStream data = new DataOutputStream(file);
        byte[] b = {65,67,78};
         data.write(b);
        data.flush();
        data.close();
        System.out.println("Sucess");
    }


}
