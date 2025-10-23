import java.util.Scanner;

public class GradeCalculator {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
         System.out.println("\nENTER NUMBER OF SUBJECTS--> ");
           int n = sc.nextInt();

           
           int[] marks = new int[n];
           int total = 0;

           for(int i = 0; i < n; i++) {
               System.out.println("\n ENTER MARKS FOR SUBJECT " + (i + 1) + " (OUT OF 100)" );
               marks [i] = sc.nextInt();
               total += marks[i];
            }

            //Calculation Of Average Percentage
            double average = (double) total / n;

            // Calculation of Grade
            
            char grade;
            if(average >= 90) {
               grade  = 'A';
            } else if(average >= 80) {
               grade = 'B';
            } else if(average >= 70) {
               grade = 'C';
            } else if(average >= 60) {
               grade = 'D';
            } else if(average >= 50) {
               grade = 'E';
            } else {
               grade = 'F';
            }


            System.out.println("\n----->RESULT<-----");
            System.out.println("\n TOTAL MARKS--> " + total);
            System.out.println("\nAVERAGE PERCENTAGE " + average + " %");
            System.out.println("\n GRADE = " + grade);
        }
    }
}

