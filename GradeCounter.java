import java.util.Scanner;

public class GradeCounter {
    /*
    *A ClassAverage ’s main method implements the class-averaging
      algorithm described by the pseudocode in it allows the user to enter 10 grades,
      then calculates and displays the average. */

    /*
    *A class of ten students took a quiz. The grades (integers in the range 0–100) for this
    quiz are available to you. Determine the class average on the quiz */

    //Pseudocode
    /*
    Set total to zero
       1. Set grade counter to one
        2.While grade counter is less than or equal to ten
        3.Prompt the user to enter the next grade
        4.Input the next grade
        5.Add the grade into the total
        6.Add one to the grade counter
        7.Set the class average to the total divided by ten
        8.Print the class average* */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// create a scanner to obtain input from command line

        int total =0;
        int gradeCounter = 1;

        while(gradeCounter <= 10)
        {
            System.out.print("Enter Grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        int average = total / 10;//terminate phases..

        System.out.printf("%nTotal of all 10 grades is: %d%n ",total);
        System.out.printf("Class average is: %d%n", average);
    }
}
