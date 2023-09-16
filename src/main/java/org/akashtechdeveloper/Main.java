package org.akashtechdeveloper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int numberOfMatches = 0;
        System.out.println("Welcome to our Score Application");
        System.out.println();
            System.out.println("Enter scores for up to 5 matches (enter a negative score to terminate):");

            while (numberOfMatches < 5) {
                System.out.print("Enter score for match " + (numberOfMatches + 1) + ": ");
                int score = scanner.nextInt();

                if (score < 0) {
                    break;
                }

                totalScore += score;
                numberOfMatches++;
            }

            if (numberOfMatches == 0) {
                System.out.println("No matches were played.");
            } else {
                double averageScore = (double) totalScore / numberOfMatches;

                System.out.println("Total Score: " + totalScore);
                System.out.println("Number of Matches: " + numberOfMatches);
                System.out.println("Average Score per Match: " + averageScore);
            }

            scanner.close();

    }
}
