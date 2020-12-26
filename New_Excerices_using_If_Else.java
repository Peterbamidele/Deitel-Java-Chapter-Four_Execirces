import java.util.Scanner;

public class New_Excerices_using_If_Else {
    /*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Quantity: ");
        int x = input.nextInt();
    if((x*10)>1000){
        System.out.println("You Get A Discount of "+(.1*x*100)+"And Your Total Cost Is "+(x*100-(.1*x*100)));
    }
    else{System.out.println("No Discount");
    }

    }


}
