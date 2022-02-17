package feb17th;
import java.lang.reflect.*;

class Shape{
    Shape() {
        System.out.println("Default");
    }
}
class Circle extends Shape{
    //field
    public  int radius;

    //constructor
    public Circle(){
        System.out.println("Default circle");
    }
    Circle(int r){
        System.out.println("Parameterise constructor::"+r);
    }

    //methods
    public void area(int r){
        float area= (float) (Math.PI*r*r);
        System.out.println("Result is::"+area);
    }
    public void show(){
        System.out.println("I am show Circle");
    }
}
public class ReflectionDemo {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        //step1:object of class
        Circle c=new Circle();
        Circle c1=new Circle(2);
        c1.show();
        ReflectionDemo r=new ReflectionDemo();

        //step2:class Details ,create an instance of Class
        Class obj=c.getClass();
        Class obj_r=r.getClass();

        //name: of the class
        String name= obj.getName();
        System.out.println("Class name is::"+name);
        System.out.println("Class name is::"+obj.getCanonicalName());
        System.out.println("Class name is::"+obj.getSimpleName());
        System.out.println("Class name is::"+obj.getTypeName());
        //modifier of the class

        int modifier=obj.getModifiers();
        // String mod= Modifier.toString(modifier);
        System.out.println("Modifier of Circle is::"+modifier);

        System.out.println("********************");
        int modifier1=obj_r.getModifiers();
        String mod1= Modifier.toString(modifier1);
        System.out.println("Modifier od RelfectionDemo is::"+mod1);

        System.out.println("********************");
        //superclass
        Class superclass=obj.getSuperclass();
        System.out.println("Superclass of Circle is::"+superclass);

        System.out.println("********************");

        //Constructor
        Constructor[] constructor =obj.getDeclaredConstructors();
        for (Constructor c12:constructor) {
            //construtor name
            System.out.println("Constructor name is::"+c12.getName());

            //modifier
            int modifier2=c12.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+c12.getParameterCount());
            System.out.println(" ");
        }

        Method[] method=obj.getMethods();
        for (Method m1:method) {
            //construtor name
            System.out.println("Method name is::"+m1.getName());

            System.out.println("DeclaredMethod");
            Method m2=obj.getDeclaredMethod("area",int.class);
            m2.invoke(c,2);
            System.out.println("Declared method");

            //modifier
            int modifier2=m1.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+m1.getParameterCount());
            System.out.println(" ");
        }
        System.out.println("********************");
        Field field1=obj.getField("radius");
        //field1.setAccessible(true);//for private
        field1.set(c,4);

        //getter
        int typeValue = (int) field1.get(c);
        System.out.println("Value of radius is::"+typeValue);

        //modifier
        int modifier3=field1.getModifiers();
        String mod3= Modifier.toString(modifier3);
        System.out.println("Modifier od Field is::"+mod3);
         // for field[] foreach
        System.out.println("**************************************");
        Field[]  fields = obj.getDeclaredFields();
        for (Field f:fields
             ) {
            System.out.println(f);
        }
    }
}
/** Output
 * "C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50477:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\Java_Work\out\production\Java_Work" feb17th.ReflectionDemo
 * Default
 * Default circle
 * Default
 * Parameterise constructor::2
 * I am show Circle
 * Class name is::feb17th.Circle
 * Class name is::feb17th.Circle
 * Class name is::Circle
 * Class name is::feb17th.Circle
 * Modifier of Circle is::0
 * ********************
 * Modifier od RelfectionDemo is::public
 * ********************
 * Superclass of Circle is::class feb17th.Shape
 * ********************
 * Constructor name is::feb17th.Circle
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Constructor name is::feb17th.Circle
 * Modifier od RelfectionDemo is::public
 * Parameters are ::1
 *
 * Method name is::area
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::1
 *
 * Method name is::show
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::wait
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::wait
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::2
 *
 * Method name is::wait
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::1
 *
 * Method name is::equals
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::1
 *
 * Method name is::toString
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::hashCode
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::getClass
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::notify
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * Method name is::notifyAll
 * DeclaredMethod
 * Result is::12.566371
 * Declared method
 * Modifier od RelfectionDemo is::public
 * Parameters are ::0
 *
 * ********************
 * Value of radius is::4
 * Modifier od Field is::public
 * **************************************
 * public int feb17th.Circle.radius
 *
 * Process finished with exit code 0
 *
 */