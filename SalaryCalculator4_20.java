import java.util.Scanner;

public class SalaryCalculator4_20 {
    /*Salary Calculator) Develop a Java application that determines the gross pay for each of
    three employees. The company pays straight time for the first 40 hours worked by each employee
    and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
    number of hours worked last week and their hourly rates. Your program should input this information for each employee,
    then determine and display the employee’s gross pay. Use class Scanner to input the data.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pay; // gross pay
        double hours; // hours worked
        double rate; // hourly rate
        int count = 1; // number of employees

        while(count <= 3){
            System.out.print("Enter Hourly Rate: ");//
            rate = input.nextDouble();

            System.out.print("Enter Hour Worked: ");
            hours = input.nextDouble();

            if (hours > 40)
                pay = (40.0 * rate)+ (hours - 40) * (rate * 1.5);
            else
                pay = hours * rate;

            System.out.printf("Pay for Employee: %d is $%.2f\n", count,pay);
            count++;

        }
    }
}
