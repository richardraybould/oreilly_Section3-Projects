import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sumInputs = 0;

        //primary read
        System.out.println("Enter a non negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);

            System.out.println("Enter a non negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
            sumInputs=sumInputs+input;// sumInputs+=inputs
        }//end while

        System.out.println("Done!");
        System.out.println("sum of Inputs = "+ sumInputs);

    }//end main
}

