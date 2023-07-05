package coding_challenges.section10;

import java.util.Scanner;

public class studentStatistics {

    public static void main(String[] args) {
        Scanner uIn = new Scanner(System.in);
        System.out.println("Student Exam Statistics");
        System.out.println("\nWelcome to the program.\n");
        System.out.print("Please enter the number of students who took the exam: ");
        int numOfStudents = uIn.nextInt();
        int[] marksArray = new int[numOfStudents];
        System.out.print("Please enter the maximum marks possible: ");
        int maxMarksPossible = uIn.nextInt();
        for ( int i=1; i <= marksArray.length; i++) {
            boolean isEnteredCorrectly = false;
            do {
                System.out.print("Student " + i + " : ");
                int tempVar = uIn.nextInt();
                if (tempVar <= maxMarksPossible) {
                    marksArray[i - 1] = tempVar;
                    isEnteredCorrectly = true;
                } else {
                    System.out.println("The marks obtained cannot be greater than the maximum marks for the exam.");
                }
            } while(!isEnteredCorrectly);
        }

        System.out.println("\n....Percentage marks obtained by each student....");
        int percentMarks;
        int sumOfPercentage = 0;
        for( int i=0; i<marksArray.length; i++){
            percentMarks = (marksArray[i]*100)/maxMarksPossible;
            System.out.println("Student " + (i+1) +" : " + percentMarks);
            sumOfPercentage = sumOfPercentage + percentMarks;
        }

        System.out.println("\n....Mean score of the exam....");
        int sumOfMarks = 0;
        for (int j : marksArray) {
            sumOfMarks = sumOfMarks + j;
        }
        System.out.printf("The mean score of of the exam is: %.2f\n", (double)sumOfMarks/numOfStudents);
        System.out.printf("The percentage of the exam is: %.2f", (double)sumOfPercentage/numOfStudents);

    }
}
