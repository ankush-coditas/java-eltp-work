package feb10th;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterDemo {
    public static void main(String[] args) throws IOException {

        PrintWriter w1  = new PrintWriter(new File("src/feb10th/out.txt"));
        w1.write("Exploring the java.");
        w1.flush();
        w1.close();
        PrintWriter w = new PrintWriter(System.out);
        w.write("Welcome to java World.");
        w.flush();
        w.close();



    }
}
