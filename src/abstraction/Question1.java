package abstraction;
 abstract class Vehicle{
    public abstract void dispalyEngine();

        }
class Car extends Vehicle{

    @Override
    public void dispalyEngine() {
        System.out.println("car has good engine");
    }
}
class Truck extends Vehicle {

    @Override
    public void dispalyEngine() {
        System.out.println("truck has bad engine");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Vehicle obj;

        obj = new Car();
        obj.dispalyEngine();
      obj= new Truck();
        obj.dispalyEngine();

    }
}
