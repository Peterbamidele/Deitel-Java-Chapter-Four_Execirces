import java.util.Scanner;

public class SalesCommissionCalculator4_19 {
    /*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item   Value
1       239.99
2       129.75
3       99.95
4       350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gross = 0.0;
        double earning = 0;
        int product = 0;
        int numberSold = 0;

        while (product < 4){
            product++;

            System.out.printf("Enter number of sold old product #%d: ",product);
            numberSold = input.nextInt();// alert user to enter

        }

        if (product == 1)
            gross += numberSold * 239.99;
            else if(product == 2 )
                gross += numberSold * 129.75;
            else if (product == 3)
                gross += numberSold * 99.95;
            else if (product == 4)
                gross += numberSold * 350.89;
        earning = 0.09 * gross + 200;
        System.out.printf("Earning this week: $%.2f\n",earning);
    }
}
