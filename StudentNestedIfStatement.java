import java.io.Serializable;

public class StudentNestedIfStatement {
    /*
    * Class Student stores a student’s name and average and provides methods for
    manipulating these values. The class contains:
    • instance variable name of type String to store a Student ’s name
    • instance variable average of type double to store a Student ’s average in
    a course
    • a constructor that initializes the name and average —in Section 5.9,
    you’ll learn how to express more concisely with logical
    operators that can test multiple conditions
    • methods setName and getName to set and get the Student ’s name
    • methods setAverage and getAverage to set and get the Student ’s
    average
    •
    method getLetterGrade (lines 49–65), which uses nested if ... else statements to
    determine the Student ’s letter grade based on the Student ’s average
        * The constructor and method setAverage each use nested if statements
        to validate the value used to set the average —these statements ensure that the
        value is greater than 0.0 and less than or equal to 100.0 ; otherwise, average ’s value is left
    unchanged. Each if statement contains a simple condition. If the condition is true,
    only then will the condition be tested, and only if the conditions
    are true will the statement in execute.*/
  private String StudentName;
  private  double average;


    public StudentNestedIfStatement(String studentName, double average) {
       this. StudentName = studentName;
        if (average > 0.0)
        if (average <= 100.0)
            this.average = average;

    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }


    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average > 0.0)
            if (average <= 100.0)
            this.average = average;
    }

    public String getLettergrade(){

        String lettergrade = ""; // initialized to empty String
        if (average > 90.0)
            lettergrade ="Grade is A";
        else if (average >= 80.0)
            lettergrade = "Grade is B";
        else if (average >= 70.0)
        lettergrade = "Grade is C";
        else if (average >= 60.0)
            lettergrade = "Grade is D";
        else
            lettergrade = "Grade is F";

        return lettergrade;
    }

}

