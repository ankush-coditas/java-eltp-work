package abstraction;
  abstract  class  Shape{
      public abstract void area();
}
class Circle extends Shape{
    int radius =2;
    @Override
    public void area() {

        System.out.println("The Area off the Circle is::"+(Math.PI*radius*radius));
    }
}
class Cylinder extends Circle{
      int height = 3;

      @Override
    public void area(){
          System.out.println("The area of the Cylinder is ::"+(2*Math.PI*super.radius *height));
    }

}
class Square extends Shape{
      int side = 5;
    @Override
    public void area() {
        System.out.println("The area of the Square is ::"+(side*side));
    }
}
class Rectangle extends Square{
int length =7;
int breath = 10;
    @Override
    public void area() {
        System.out.println("The area of the Retangle is ::"+(length*breath));
    }
}

public class Question4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0]= new Square();
        shapes[1]= new Circle();
        shapes[2]=new Cylinder();;
        shapes[3]= new Rectangle();
        for (Shape e: shapes) {
            e.area();
        }
    }


}
