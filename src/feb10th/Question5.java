package feb10th;

import java.io.*;

//Streams represent resources which you must always clean up explicitly, by calling the close method.
public class Question5 {
    public static void main(String args[])
            throws FileNotFoundException
    {
        InputStream is = null;
        OutputStream os = null;

        try {

            is = new FileInputStream("src/feb10th/file1.txt");
            os = new FileOutputStream("src/feb10th/file2.txt");

        }
        finally {
            try {
                if (is != null)
                    is.close();
            }
            catch (IOException e) { /* handle */
            }
            try {
                if (os != null)
                    os.close();
            }
            catch (IOException e) { /*handle */
            }
        }
    }
}
