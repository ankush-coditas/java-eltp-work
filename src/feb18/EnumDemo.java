package feb18;
enum Signal{
    RED("STOP"),YELLOW("DRIVE VERY SLOW"), GREEN("GO");

String s;
    Signal(String  s) {
  this.s = s;

    }

}
public class EnumDemo {
    public  static  void sign( Signal s){

        switch (s){
            case RED:
                System.out.println("RED MEANS STOP\n");
                break;
            case GREEN:
                System.out.println("GREEN MEANS GO\n");
                break;
            case YELLOW:
                System.out.println("YELLOW MEANS DRIVE VERY SLOW\n");
                break;

        }


    }

    public static void main(String[] args) {
        EnumDemo obj = new EnumDemo();
        obj.sign(Signal.RED);
        obj.sign(Signal.GREEN);
        obj.sign(Signal.YELLOW);

    }
}
/*OUTPUT
RED MEANS STOP

GREEN MEANS GO

YELLOW MEANS DRIVE VERY SLOW

 */

