import java.util.Scanner;

public class Palindromes4_30 {
    /*
    4.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
    ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
    and 11611. Write an application that reads in a five-digit integer and determines whether it is a pal-
    indrome. If the number is not five digits long, display an error message and allow the user to enter
    a new value
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,digit,digit1, digit2, digit3,digit4,digit5;

    number = 0;
    digit = 0;
    while(digit != 5 ){
        System.out.println("Enter a 5 digit number: ");
        number = input.nextInt();

        if ( number < 1000){
            if (number > 999)
                digit = 5;
            else
                System.out.println("Your Number must be 5 digit");
        }
        else
            System.out.println("You must enter 5 digits number");

    }


    }

}


