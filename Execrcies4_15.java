public class Execrcies4_15 {
    /*
    * 4.15 Identify and correct the errors in each of the following pieces of code. [Note: There may be
    more than one error in each piece of code.]*/
    /*
    * a) if (age >= 65);
System.out.println("Age is greater than or equal to 65");
else
System.out.println("Age is less than 65)";
b)
int x = 1, total;
while (x <= 10)
{
total += x;
++x;
}
c)
while (x <= 100)
total += x;
++x;
d)
while (y > 0)
{
System.out.println(y);
++y;*/
    public static void main(String[] args) {
        /* 1
        *  * a) if (age >= 65);
        System.out.println("Age is greater than or equal to 65");*/
        int age = 0;
        if (age >= 65)
            System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than 65");
        //Answer
        /*The semicolon at the end of the if condition should be removed. The closing double
        quote of the second System.out.println should be inside the closing parenthesis.*/


        /* 2
        * int x = 1, total;
            while ( x <= 10 )
            {
            total += x;
            ++x;
            }*/

        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
        System.out.println(total);
        //Answer
        /*The variable total should be initialized to zero.*/


        //3
        /*while (x <= 100)
            total += x;
            ++x;*/

        while (x <= 100)
            total += x;
        ++x;
        /*ANSWER: The two statements should be enclosed in curly braces to properly group them into
           the body of the while ; otherwise the loop will be an infinite loop.*/


        //4
        /*
        * while (y > 0)
        {
        System.out.println(y);
        ++y;*/

        int y = 0;
        while (y > 0) {
            System.out.println(y);
        }
            --y;
        /*ANSWERS:The ++ operator should be changed to -- ; otherwise the loop will be an infinite loop.
The closing curly brace for the while loop is missing.*/
        }
    }



