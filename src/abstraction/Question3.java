package abstraction;
abstract class Medicine {



    public void displayLabel () {
            System.out.println("Company : Health Care");
            System.out.println("Address : Mumbai");
        }
    }



class Tablet extends Medicine {
    @Override
    public void displayLabel() {
        System.out.println("store in a cool dry place");
    }
}


class Syrup extends Medicine {

    @Override
    public void displayLabel() {
        System.out.println("Consumption as directed by the physician");
    }
}

class Ointment extends Medicine {
    @Override
    public void displayLabel() {
        System.out.println("for external use only");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Medicine medicines[] = new Medicine[10];


        for (int i = 0; i < medicines.length; i++) {
            double ran_num = Math.random() * 4;
            int j = (int) ran_num;
            switch (j) {
                case 1:
                    medicines[1] = new Tablet();
                    medicines[1].displayLabel();
                    break;
                case 2:
                    medicines[3] = new Syrup();
                    medicines[3].displayLabel();
                    break;
                case 3:
                    medicines[5] = new Ointment();
                    medicines[5].displayLabel();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }

    }
}
