import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        float quizResult, midtermExamResult, finalExamResult;
        double gradeAverage;
        
        Scanner result = new Scanner(System.in);
        
        System.out.print("The Result of the QUIZ Exam: ");     quizResult = result.nextFloat();
        System.out.print("The Result of the MIDTERM EXAM: ");     midtermExamResult = result.nextFloat();
        System.out.print("The Result of the FINAL Exam: ");     finalExamResult = result.nextFloat();

        gradeAverage = (quizResult*0.2) + (midtermExamResult*0.3) + (finalExamResult*0.5);

        System.out.println("The AVERAGE of the Grades is " + gradeAverage + ".");

        String lastSituation = (gradeAverage >= 50) ? "Good Job! You PASSED." : "Try Again! You FAILED.";
        System.out.println(lastSituation);
    }
}