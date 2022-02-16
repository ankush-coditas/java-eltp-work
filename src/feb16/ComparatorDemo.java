package feb16;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(15,"Ankush ", 150000f));
        list.add(new Employee(23,"Anup",20000f));
        list.add(new Employee(12,"John",50000f));
        list.add(new Employee(11,"Alexander",10000f));
        list.add(new Employee(14,"Yash",50000f ));

        System.out.println("********BEFORE SORTING***********");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



        System.out.println("********AFTER SORTING BY NAME***********");
              Collections.sort(list,new SortName());

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("********Case : get those Employees whose  salary is greater than 15000 ***********");
        Collections.sort(list);
        for (Employee e:list
             ) {
            if(e.Salary>15000){
                System.out.println(e);
            }
        }


    }
}
/**
 * "C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57807:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\Java_Work\out\production\Java_Work" frb16.ComparatorDemo
 * ********BEFORE SORTING***********
 * Employee{id=15, name='Ankush ', Salary=150000.0}
 * Employee{id=23, name='Anup', Salary=20000.0}
 * Employee{id=12, name='John', Salary=50000.0}
 * Employee{id=11, name='Alexander', Salary=10000.0}
 * Employee{id=14, name='Yash', Salary=50000.0}
 * ********AFTER SORTING BY NAME***********
 * Employee{id=11, name='Alexander', Salary=10000.0}
 * Employee{id=15, name='Ankush ', Salary=150000.0}
 * Employee{id=23, name='Anup', Salary=20000.0}
 * Employee{id=12, name='John', Salary=50000.0}
 * Employee{id=14, name='Yash', Salary=50000.0}
 * ********Case : get those Employees whose  salary is greater than 15000 ***********
 * Employee{id=15, name='Ankush ', Salary=150000.0}
 * Employee{id=23, name='Anup', Salary=20000.0}
 * Employee{id=12, name='John', Salary=50000.0}
 * Employee{id=14, name='Yash', Salary=50000.0}
 *
 * Process finished with exit code 0
 */
