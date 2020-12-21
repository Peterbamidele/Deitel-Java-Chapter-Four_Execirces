public class MultiplesOf2WithAnInFiniteLoop_4_23 {
        /*
        * 4.33 (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
        command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
        should not terminate (i.e., it should create an infinite loop). What happens when you run this pro-
        gram?*/
        public static void main(String[] args) {
            int x = 1;
//            System.out.println("\nMultiple of 2: ");
//            while(true)
//            {
//                if (x%2==0)
//                {
//                    System.out.print(x +", ");
//                }
//                x++;
//            }
            while(true)
            {
                x *= 2;
                System.out.println(x);
            }
        }
}
