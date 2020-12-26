import java.util.Scanner;

public class Value_EnterByUser_Using_ifElse {
    /*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter Value: ");
        int x = Input.nextInt();
        if(x<0){
            System.out.println("Absoulute value : "+(-1*x));
        }
        else {
            System.out.println("Absolute Value : "+x);
        }
    }
}

