package polymorphism;

import java.util.Scanner;

class Shape1{
    void calculateArea(int lenght, int breath){
        System.out.println("The area of Rectangle is "+(lenght*breath));
    }
    void calculateArea(double base , double height){
        System.out.println("The area of Triangle is "+(0.5*base*height));
    }
    void calculateArea(int radius){
        System.out.println("The area of Circle is "+(Math.PI*radius*radius));
    }
}
public class TestClass {
    public static void main(String[] args) {
        Shape1 obj = new Shape1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for Rectangle");
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the Breath");
        int breath = sc.nextInt();
        System.out.println("Enter the details for Triangle");
        System.out.println("Enter the base");
        double base = sc.nextInt();
        System.out.println("Enter the height");
        double height = sc.nextInt();
        System.out.println("Enter the details for Circlee");
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        obj.calculateArea(length,breath);
        obj.calculateArea(base,height);
        obj.calculateArea(radius);




    }
}
