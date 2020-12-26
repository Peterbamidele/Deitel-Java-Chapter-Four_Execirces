import java.util.Scanner;

public class Lenght_BreathOf_Rectangle_Square {
    /*Take values of length and breadth of a rectangle from user and check if it is square or not.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int x= input.nextInt();

        System.out.println("Enter Breadth: ");
        int y = input.nextInt();

        if(x==y){
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
