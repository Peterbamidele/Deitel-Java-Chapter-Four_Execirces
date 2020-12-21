import org.w3c.dom.ls.LSOutput;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
//            counter+= 1;
            counter++;
            System.out.printf("%d ", counter);
//            ++counter;

        }

        // infinite -loop
//        int i = 20;
//        while (i <= 200) {
//            int multiple = +20;
//            System.out.printf("%d ", i);
//            i -= 20;
//
//        }

        System.out.println();
    }
}

