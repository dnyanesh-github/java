package coding_challenges.section10;

import java.util.Scanner;

public class trueOrFalseQuestions {
    public static void main(String[] args) {
        System.out.println(".....Enter true or false.....\n");
        Scanner uIn = new Scanner(System.in);

        String[] quizArray = {"Canberra is the capital of Australia.", "Zero divided by anything is zero.",
                                "Height of Mount everest is 6,236 meters", "Java program needs compilation before execution",
                                "Java is slower than python"};

        boolean[] quizAnswers = { true, true, false, true, false };

        Boolean[] userAnswers = new Boolean[5];

        for (int i=0; i<quizArray.length; i++) {
            System.out.print("Question " + i+1 + ". " + quizArray[i] + " : ");
            userAnswers[i] = uIn.nextBoolean();
        }

        System.out.println("\nYour answers were: \n");
        for (int i=0; i<quizArray.length; i++) {
            System.out.println(quizArray[i] + " : " + userAnswers[i]);
        }

        int count = 0;
        for(int i=0; i<quizArray.length; i++) {
            if (userAnswers[i] == quizAnswers[i]) {
                count++;
            }
        }
        if ( count == 5 ) {
            System.out.println("\nBrilliant! You got all 5 of them right.");
        }
        else {
            System.out.printf("\nWell, you got %d of them right\n", count);
            System.out.println("\n.....The correct answers were.....\n");
            for (int i=0; i<quizArray.length; i++ ){
                System.out.println(quizArray[i]  + " : " + quizAnswers[i] );
            }
        }
    }
}
