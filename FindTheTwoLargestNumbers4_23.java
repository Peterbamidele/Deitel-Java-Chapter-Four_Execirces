import java.util.Arrays;
import java.util.Scanner;

public class FindTheTwoLargestNumbers4_23 {
    /*
    (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
     the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest;
        int secondLargest;
        int number;
        int nextLargest;
        int i ;


        // collect first number  from user and assihn it to larger
        System.out.print("Enter Number: ");
        largest = input.nextInt();

        //collect second number and compare with first number
        System.out.print("Enter Number; ");
        number = input.nextInt();

        if (number > largest)
        {
            secondLargest = largest;
            largest = number;
        }
        else
            secondLargest = number;
        i = 2;

        while (i < 10)
        {
            System.out.println("Enter Number: ");
            number = input.nextInt();

            if(number >largest){
                secondLargest = largest;
                largest = number;
            }
            else if(number > secondLargest)
                secondLargest = number;
            i++;
        }
        System.out.printf("largest number %d\nSecond Largest is %d\n",largest,secondLargest);
    }
}
