import java.util.Arrays;

class StringOperation {

    public void printSortedStrings(String[] s) {
        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0; j <s.length-i-1 ; j++) {
                if(s[j].length()>s[j+1].length()){
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));

    }


}

public class Driver {

    public static void main(String[] args) {
      String[] s = {"aa","bbdd","ccvvv"};
       StringOperation obj = new StringOperation();
       obj.printSortedStrings(s);
    }
}

