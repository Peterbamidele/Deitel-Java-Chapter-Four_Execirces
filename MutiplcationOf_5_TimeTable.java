public class MutiplcationOf_5_TimeTable {
    public static void main(String[] args) {
        int num = 5, i=1;

        while (i<12){
            System.out.printf("%d * %d = %d\n", num, i,num * i);
            ++i;

        }
        System.out.println("\n");

        int counter = 9, muti = 1;
        while (muti < 12){
            System.out.printf("%d * %d = %d\n", counter, muti,counter * muti);
            ++muti;
        }


        System.out.println("\n");

        int count = 125, mut = 1;
        while (mut < 12){
            System.out.printf("%d * %d = %d\n", count, mut,count * mut);
            ++mut;
        }
    }
}
