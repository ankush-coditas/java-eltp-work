  abstract class  Print<T>{
 abstract T print(T t1,T t2);
}
public class DiamondOperatorDemo{

public static void main(String args[]){

Print <String> s = new Print<>(){

String print(String s1,String s2){
return s1+s2;

}

};
String obj = s.print("Ankush","Bharambe");
System.out.println(obj);

}


}