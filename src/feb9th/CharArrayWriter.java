package feb9th;

import java.io.FileWriter;
import java.io.IOException;
//used to write common data to multiple files
public class CharArrayWriter {
    public static void main(String args[]) throws IOException {
        java.io.CharArrayWriter out=new java.io.CharArrayWriter();
        out.write("Welcome to java world" );

        FileWriter f1=new FileWriter("src/feb9th/a1.txt");
        FileWriter f2=new FileWriter("src/feb9th/a2.txt");
        FileWriter f3=new FileWriter("src/feb9th/a3.txt");

        System.out.println("Success.....");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);

        f1.close();
        f2.close();
        f3.close();
    }
}
