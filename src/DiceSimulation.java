import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;
        int count = 0;
//for(int i = 0; i < 10; i++) {}
        while ( count < 10 ) {
            count++;
            myRandomNumber = random.nextInt(6) + 1;
            System.out.println("Dice throw " + count + "\t= " + myRandomNumber);

        }//end while

    }//end main
}//end class

