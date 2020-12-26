import java.util.Scanner;

public class Factoria_Using_WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =56, i= 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Number of %d = %d",num,factorial);

    }

}
