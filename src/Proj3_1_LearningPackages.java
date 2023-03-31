import java.util.Arrays;
import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        // declare variables
        Scanner keyboard = new Scanner(System.in); //for keyboard data entry
        int learningPackage;
        int coursesTaken;
        int totalCost = 0;
        int packageCost = 0;
        int additionalCost = 0;
        int additionalCourses = 0;

        // define packages
        System.out.println("Packages");
        System.out.println("Learning Package 1\n\t$10/month, included 2 courses per month\n\tEach additional course is $6");
        System.out.println("Learning Package 2\n\t$12/month, included 4 courses per month\n\tEach additional course is $4");
        System.out.println("Learning Package 3\n\t$15/month, included 6 courses per month\n\tEach additional course is $3");

        // ask user which learning package is selected 1,2, or 3
        System.out.print("Which package (1,2,3)?\t");
        learningPackage = keyboard.nextInt();

        // ask user how many courses they took
        System.out.print("How many courses taken ?\t");
        coursesTaken = keyboard.nextInt();

        // display data for confirmation
        System.out.println("Package :"+learningPackage);
        System.out.println("Courses :"+coursesTaken);

        // calculate cost per month based on package taken and number of courses included
        switch (learningPackage) {
            case 1:
            {
                packageCost = 10;
                additionalCourses = coursesTaken - 2;
                if (additionalCourses >0) {
                    additionalCost = additionalCourses * 6;
                }

                break;
            }//case 1
            case 2:
            {
                packageCost = 12;
                additionalCourses = coursesTaken - 4;
                if (additionalCourses >0) {
                    additionalCost = additionalCourses * 4;
                }
                break;
            }//case 2
            case 3:
            {
                packageCost = 15;
                additionalCourses = coursesTaken - 6;
                if (additionalCourses >0) {
                    additionalCost = additionalCourses * 3;
                }
                break;
            }//case 3
            default:
            {
                System.out.println("Something went wrong");
                System.out.println("invalid learning package selection");
                break;
            }


        }//end switch
        totalCost = packageCost + additionalCost;

        // output total monthly cost
        System.out.println("Your total cost is:\t$" + totalCost);
        System.out.println("Package cost:\t$" + packageCost);
        System.out.println("additional cost:\t$" + additionalCost);




    }//end main
}//end class
