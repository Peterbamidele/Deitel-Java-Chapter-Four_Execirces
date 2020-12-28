import java.util.Scanner;

public class While_loop_ExamResult {
    /*
    * A college offers a course that prepares students for the state licensing exam for real-estate
    brokers. Last year, ten of the students who completed this course took the exam. The col-
    lege wants to know how well its students did on the exam. You’ve been asked to write a
    program to summarize the results. You’ve been given a list of these 10 students. Next to
    each name is written a 1 if the student passed the exam or a 2 if the student failed.
    Your program should analyze the results of the exam as follows:
    1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen
    each time the program requests another test result.
    * 2. Count the number of test results of each type.
    3. Display a summary of the test results, indicating the number of students who passed and
    the number who failed.
    4. If more than eight students passed the exam, print “Bonus to instructor!”*/
    public static void main(String[] args) {

        //pseudocode of the program
        /* using Top-down
        Analyze exam results and decide whether a bonus should be paid*/

/*
    Initialize passes to zero
    Initialize failures to zero
    Initialize student counter to one

    While student counter is less than or equal to 10
    Prompt the user to enter the next exam result
    Input the next exam result

    If the student passed
         Add one to passes
    Else
        Add one to failures

        Add one to student counter

    Print the number of passes
    Print the number of failures

    If more than eight students passed
    Print “Bonus to instructor!”
* */

        Scanner input = new Scanner(System.in);

        //initialize variables
         int pass = 0;
         int fail = 0;
         int studentCounter = 1;

         while (studentCounter <= 10)
         {
             System.out.print("Enter The Next Result (1 = pass, 2 = fail): ");
             int result = input.nextInt();

             if (result == 1)
                 pass = pass + 1;
             else
                 fail = fail + 1;

             studentCounter = studentCounter + 1;

         }
        System.out.printf("Pass: %d%nFailed: %d%n" , pass,fail);

         if (pass > 8)
             System.out.println("Bonus to instructor!");

    }
}
