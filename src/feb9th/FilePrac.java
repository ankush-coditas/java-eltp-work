package feb9th;

import java.io.File;

public class FilePrac {
    public static void main(String[] args) {
        File f=new File("src/feb9th/Abc.txt");
        if(f.exists()){
            System.out.println("File Exists");
            System.out.println("File path 1 is::"+f.getAbsolutePath());
            System.out.println("File path 2 is::"+f.getPath());
            System.out.println("File name is::"+f.getName());
            System.out.println("File parent is::"+f.getParent());
            System.out.println("File Parent is::"+f.getParentFile());
            System.out.println("File property:read=="+f.canRead());
            System.out.println("file property:write=="+f.canWrite());
            System.out.println("File property:execute=="+f.canExecute());

        }
        else
            System.out.println("File Does not exists");
    }
}
