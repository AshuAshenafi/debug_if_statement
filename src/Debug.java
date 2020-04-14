import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        char grade;
        int testscore;

        System.out.print("Please Enter the test score: ");
        Scanner input = new Scanner(System.in);
        testscore = input.nextInt();


        if (testscore >= 90) {
            grade = 'A';
        }
        else if (testscore >= 80) {
            grade = 'B';
        }
        else if (testscore >= 70) {
            grade = 'C';
        }
        else if (testscore >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        
        System.out.println("Grade = " + grade);
    }

}