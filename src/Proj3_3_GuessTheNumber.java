import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        // declare variables
        Scanner keyboard = new Scanner(System.in); //for keyboard data entry
        Random random = new Random();
        int myRandomNumber;
        int guessCount = 0;
        boolean keepGuessing;
        int myGuess;
        int guessLimit = 10;
        //Get Random number between 1 and 100
        myRandomNumber = random.nextInt(100) + 1; //1 - 100
        //System.out.println("1 through 100?\t" + myRandomNumber);

        System.out.println("Enter your guess :");
        myGuess = keyboard.nextInt();
        guessCount++;

        int count = 0;
        while (count < guessLimit ) {
            if ( myGuess < 1 || myGuess > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100 inclusive");
            }
            else if (myGuess == myRandomNumber) {
                System.out.println("Congratulations! You guessed the number in " + count + " guesses!  Thanks for playing!");
                break;
            }//end if

            else if (myGuess < myRandomNumber) {
                System.out.println("Your guess was too low");
            }
            else if (myGuess > myRandomNumber)
            {
                System.out.println("Your guess was too high");
            }

            System.out.println("Enter your guess :");
            myGuess = keyboard.nextInt();
            count++;



        }//end while
        System.out.println("The random number was (1 through 100) ?\t" + myRandomNumber);


    }//end main
}//end class
