public interface AnotherDanglingElseProblem {
    /*
    * 4.28 (Another Dangling- else Problem) Modify the given code to produce the output shown in
each part of the problem. Use proper indentation techniques. Make no changes other than inserting
braces and changing the indentation of the code. The compiler ignores indentation in a Java pro-
gram. We’ve eliminated the indentation from the given code to make the problem more challeng-
ing. [Note: It’s possible that no modification is necessary for some of the parts.]
if (y == 8)
if (x == 5)
System.out.println("@@@@@");
else
System.out.println("#####");
System.out.println("$$$$$");
System.out.println("&&&&&");
a) Assuming that x = 5 and y = 8 , the following output is produced:
@@@@@
$$$$$
&&&&&
b) Assuming that x = 5 and y = 8 , the following output is produced:
@@@@@
c) Assuming that x = 5 and y = 8 , the following output is produced:
@@@@@
d) Assuming that x = 5 and y = 7 , the following output is produced. [Note: The last three
output statements after the else are all part of a block.]
#####
$$$$$
&&&&&
    * */
    public static void main(String[] args) {
//        int x = 5, y = 8;
//
//        if (y == 8)
//            if (x == 5)
//                System.out.println("@@@@@");
//            else
//                System.out.println("#####");
//        System.out.println("$$$$$");
//        System.out.println("&&&&&");
//        /* A. Output @@@@@
//                $$$$$
//                &&&&&*/
//
//
//        int c = 5,d =8;
//        if (d == 8){
//            if (c == 5)
//                System.out.println("@@@@@");}
//            else{
//                System.out.println("#####");
//                System.out.println("$$$$$");
//                 System.out.println("&&&&&");
//            }
//            /* B. OutPut @@@@@ **/
//        int a = 5,b =8;
//        if (b == 8)
//            if (a == 5)
//                System.out.println("@@@@@");
//        else{
//            System.out.println("#####");
//            System.out.println("$$$$$");
//            System.out.println("&&&&&");
//    }
        /* C. OutPut
        @@@@@
        * */


        int e= 5,f =8;
        if (f == 8)
            if (e == 5)
                System.out.println("@@@@@");
            else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }


            }
    }

