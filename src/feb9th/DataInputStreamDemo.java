package feb9th;
// allows an application to read primitive data from the input stream
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fn = new FileInputStream("src/feb9th/dis.txt");
        DataInputStream obj = new DataInputStream(fn);
        int cnt = fn.available();
       byte[] b = new byte[cnt];
       obj.read(b);
        for (byte e:b) {
            System.out.print((char)e);

        }

    }
}
