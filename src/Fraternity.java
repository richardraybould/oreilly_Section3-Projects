import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        char grade;
        System.out.println("Enter your age");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your gender (M/F)");
        gender = keyboard.next().charAt(0);

        if (age >= 19 && gender == 'M') {
                System.out.println("You can join a fraternity");
            }

        else {
            System.out.println("You cannot join a fraternity");
        }


    }//end main
}
