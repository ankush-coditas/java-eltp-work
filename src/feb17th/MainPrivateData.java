package feb17th;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class CatPrivate
{
    private String color;

    public String getColor() {
        return color;
    }



}
public class MainPrivateData {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {

          CatPrivate ob = new CatPrivate();
         Class obj = ob.getClass();
       // Class obj = Class.forName("feb17th.CatPrivate");  // we can use this for loading class and geting object
        //access fields of class and print details
        System.out.println("before color"+ob.getColor());
        Field field1=obj.getDeclaredField("color");
        field1.setAccessible(true);
        field1.set(ob, "frawn");
        System.out.println("After Color"+ob.getColor());


        //modifier
        int modifier=field1.getModifiers();
        String mod=Modifier.toString(modifier);
        System.out.println(modifier);
        System.out.println("Modifier is::"+mod);


    }

}
/** Output
 *"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50482:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\Java_Work\out\production\Java_Work" feb17th.MainPrivateData
 * frawn
 * 2
 * Modifier is::private
 *
 * Process finished with exit code 0
 */