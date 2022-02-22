public class RunTimeVersion{
public static void main(String[] args){

 Runtime.Version runtimeVersion = Runtime.version();
    String version = String.valueOf(runtimeVersion.version());
System.out.println("The Given Version is "+version);
}


}
/*
Output:

C:\Users\coditas\Desktop\todays codes>java RunTimeVersion
The Given Version is [9, 0, 1]


*/