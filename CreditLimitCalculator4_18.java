import java.util.Scanner;

public class CreditLimitCalculator4_18 {
    /*
    (Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
play the message "Credit limit exceeded" .* */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int account;
        int oldBalance;
        int charges;
        int credits = 0;
        int creditLimit;
        int newBalance;

        System.out.println("Enter Account Number:");
        account = input.nextInt();

        while (account != -1){
            System.out.print("Enter Balance: ");
            oldBalance = input.nextInt();

            System.out.print("Enter Charges: ");
            charges =  input.nextInt();

            System.out.print("Enter Credits: ");
            credits = input.nextInt();

            System.out.print("Enter CreditLimits: ");
            creditLimit = input.nextInt();

            newBalance = oldBalance + charges - credits;
            System.out.printf("New balance is %d\n",newBalance);

            if (newBalance > creditLimit)
                System.out.println("Credit Limit Exceeds");

            System.out.print("\n Enter Account Number: ");
            account = input.nextInt();;

        }



    }
}
