import java.util.Scanner;

public class StudentGradeUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int total = 0;
         int gradeCounter = 10;


        while(gradeCounter <= 10)
        {
            System.out.print("Enter Grade:");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        int average = total/ 10;
        System.out.printf("%nTotal of all 10 grades is: %d%n",total);
        System.out.printf("%nClass Grade is: %d%n ", average);
    }
}
