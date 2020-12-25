import java.util.Scanner;

public class NumberOfDigitsInAnIntegerUsingWhileLoop {
    // Count Number of Digits in an Integer using while loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long i = 0, num = 00000657203760;
        while (num != 0)
        {
          System.out.println("ENTER YOUR DIGIT OF NUMBER NOT LESS THAN THIRTEENTH(13) NUMBER LONG: ");
            num = input.nextLong();
            num/= 10;
            ++i;
        }
        System.out.printf("Number Of Digits: " + i);
    }
}
