package abstraction;

import java.util.Scanner;

abstract  class Instrument{

      abstract  void play();
}
class Piano extends  Instrument{
    @Override
    void play() {
        System.out.println("Piano is playing  tan tan tan tan  ");
    }
}
class Flute extends Instrument{
    @Override
    void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("Guitar is playing  tin  tin  tin ");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Instrument instrument[] = new  Instrument[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < instrument.length ; i++) {
            System.out.println("Enter the instrument which youu want to play\n 1.piano 2. Flute 3. Guitar");
            int inst_code = sc.nextInt();
            switch (inst_code) {
                case 1: {
                    instrument[i] = new Piano();
                    break;
                }
                case 2: {
                    instrument[i] = new Flute();
                    break;
                }
                case 3: {
                    instrument[i] = new Guitar();
                    break;
                }

            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Instrument to  be played ");

            instrument[i].play();
            if (instrument[i] instanceof Piano) {
                System.out.println("Piano");
            }
            if (instrument[i] instanceof Flute) {
                System.out.println("Flute");
            }
            if (instrument[i] instanceof Guitar) {
                System.out.println("Guitar");
            }
        }
    }
}
