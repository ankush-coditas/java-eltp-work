package feb21;
class Player implements Cloneable{
    String playerName;
    Player( String playerName){
        this.playerName = playerName;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }
}
public class ObjectDemo {
    int x = 10;
    public static void main(String[] args) throws CloneNotSupportedException {
        Object obj = new Object();
        ObjectDemo obj1 = new ObjectDemo();
        System.out.println("Object toString"+obj.toString());
        System.out.println("Class"+obj.getClass());
        System.out.println("Equals "+obj1.equals(obj));
        System.out.println("Hashcode "+obj1.hashCode());

         Player player = new Player("Rohit");
          Player player1 = (Player) player.clone();
        System.out.println("PLayer object"+player);
        System.out.println("Cloned object"+player1);
    }
}
/** Output
  * Object toStringjava.lang.Object@1b6d3586
 * Classclass java.lang.Object
 * Equals false
 * Hashcode 1163157884
 * PLayer objectPlayer{playerName='Rohit'}
 * Cloned objectPlayer{playerName='Rohit'}
 *
 * Process finished with exit code 0
 */
