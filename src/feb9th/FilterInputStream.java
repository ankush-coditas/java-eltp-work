package feb9th;

import java.io.*;

public class FilterInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File data = new File("src/feb9th/file_int");
        FileInputStream  file = new FileInputStream(data);
        BufferedInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}
