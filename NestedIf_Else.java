public class NestedIf_Else {
    /*
    If student’s grade is greater than or equal to 90
    Print “A”
    else
    If student’s grade is greater than or equal to 80
    Print “B”
    else
    If student’s grade is greater than or equal to 70
    Print “C”
    else
    If student’s grade is greater than or equal to 60
    Print “D”
    else
    Print “F”
    * */

    public static void main(String[] args) {
        int grade = 90;
        if(grade >= 90)
            System.out.println("Your Grade is A");
        else if (grade >= 80)
            System.out.println("Your Grade is B");
        else if(grade >= 70)
            System.out.println("Your Grade is C");
        else if(grade >= 60)
            System.out.println("Your Grade is D");
        else
            System.out.println("Your Grade is F");

    }
}
