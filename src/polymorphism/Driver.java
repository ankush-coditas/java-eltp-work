package polymorphism;
class Shape {

     String color;

    public Shape () {

    }

    public Shape (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        System.out.println("undefined Shape");
        return 0;
    }
}
class Rectangle extends Shape {

    private int length, width;

    public Rectangle(){
        System.out.println("This is the Rectangle constructor");
    }
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    public String toString() {
        return "Rectangle length=" + length + ",width=" + width + "," + super.toString() ;
    }


    @Override
    public double getArea() {
        return length*width;
    }
}
class Triangle extends Shape {

 int base, height;

  public Triangle (){
      System.out.println("This is Triangle constructor");
  }
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Triangle base=" + base + ",height=" + height + "," + super.toString() ;
    }


    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
public class Driver {
    public static void main(String[] args) {
        Shape obj_shape = new Shape("orange");
        System.out.println(obj_shape);
        System.out.println("Area is " + obj_shape.getArea());
        obj_shape = new Rectangle("red",8,9);
        System.out.println(obj_shape);
        System.out.println("Area is " + obj_shape.getArea());
        obj_shape = new Triangle("Black",8,7);
        System.out.println(obj_shape);
        System.out.println("Area is " + obj_shape.getArea());

    }
}
