public class CheckeboardPatternOfAsterisks {
    /*
    * (Checkerboard Pattern of Asterisks) Write an application that uses only the output state-
ments
System.out.print("* ");
System.out.print(" ");
System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no argu-
ments causes the program to output a single newline character. [Hint: Repetition statements are
required.]*/
    public static void main(String[] args) {
        int row = 1;
        while (row <= 8)
        {
            int colum = 1;
            if( row % 2 == 0)
                System.out.println( " " );
           while (colum <=8)
           {
               System.out.println("* ");
               colum++;
           }
            System.out.println();
           row++;
        }

    }
}
