import java.util.Scanner;

public class ValidatingUserInput4_24 {
    /*
     * (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value entered is other than 1 or 2,
     * keep looping until the user enters a correct value.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0; // number of passes
        int failures = 0; // number of failures
        int studentCounter = 1; // student counter
        int result; // one exam result

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
                studentCounter = studentCounter + 1;
            } // end if
            else if (result == 2) {
                failures = failures + 1;
                studentCounter = studentCounter + 1;
            } // end else if
            else
                System.out.println("Invalid Input");

            System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

            if (passes > 8)
                System.out.println("Raise Tuition");
        }
    }
}
