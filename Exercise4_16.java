public class Exercise4_16 {
    public static void main(String[] args) {
        int x = 1;
        int y;
        int total = 0;

        while(x <= 10)
        {
            y= x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("Total is :%d\n ", total);
    }
}
/*output
1
4
9
16
25
36
49
64
81
100
Total is :38

 */
