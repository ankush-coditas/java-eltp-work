package feb23;

public class WorkingWithGC {
    static final int MEGABYTE_IN_BYTES = 1024 * 1024;
    static final int ITERATION_COUNT = 1024 * 10;

  public   static void main(String[] args) {
        System.out.println("Starting pollution");

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int[] array = new int[MEGABYTE_IN_BYTES];
        }

        System.out.println("Terminated");
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-11.0.13\bin\java.exe" -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=55899:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath D:\Java_Work\out\production\Java_Work feb23.WorkingWithGC
Starting pollution
Terminating due to java.lang.OutOfMemoryError: Java heap space

Process finished with exit code 3



 */