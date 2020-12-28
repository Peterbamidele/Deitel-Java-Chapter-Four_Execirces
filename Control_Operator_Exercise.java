public class Control_Operator_Exercise {
    public static void main(String[] args) {
        int c = 3, d = 5, e = 4, f = 6, g = 12;
        c += 7;// c = c + 7 // 10 t0 c
        System.out.println(c);
        d -= 4;//
        System.out.println(d);
        e *= 5;
        System.out.println(e);
        f /= 3;
        System.out.println(f);
        g %= 9;
        System.out.println(g);

        System.out.println("\n");


//Increment and Decrement Operators
       int x = 5;
    //    System.out.printf("X before postincrement: %d%n", x);
       System.out.printf(" postincrementing c: %d%n", x++);
//        System.out.printf("X after postincrement:%d%n", x);

        System.out.println("\n");

   //     System.out.printf("X before pretincrement: %d%n", x);
       System.out.printf(" pretincrementing c: %d%n", ++x);
//        System.out.printf("X after pretincrement:%d%n",x);

    }
}
