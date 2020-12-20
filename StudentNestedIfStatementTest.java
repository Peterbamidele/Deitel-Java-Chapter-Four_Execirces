public class StudentNestedIfStatementTest {
    public static void main(String[] args) {
        StudentNestedIfStatement newScore = new StudentNestedIfStatement("Bamidele", 77.0);
        StudentNestedIfStatement newScore2 = new  StudentNestedIfStatement("Peter", 98.0);
        StudentNestedIfStatement newScore3 = new StudentNestedIfStatement("Segun", 35.0);

        System.out.printf("%s Your Score is: %s\n", newScore.getStudentName(),newScore.getLettergrade());
        System.out.printf("%s Your and Score is: %s\n", newScore2.getStudentName(),newScore2.getLettergrade());
        System.out.printf("%s Your and Score is: %s\n", newScore3.getStudentName(),newScore3.getLettergrade());

    }
}
