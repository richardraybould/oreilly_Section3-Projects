import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        // declare variables
        Scanner keyboard = new Scanner(System.in); //for keyboard data entry
        int userInt = 0;


        System.out.println("input an integer?");
        userInt = keyboard.nextInt();

        if (userInt % 3 != 0) {
            System.out.println(userInt + " is NOT divisible by 3");
        } else {
            System.out.println(userInt + " is  divisible by 3");
        }
        if (userInt % 3 == 0) {
            System.out.println(userInt + " is divisible by 3");
        } else {
            System.out.println(userInt + " is  NOT divisible by 3");
        }
    }//end main
}//end class
