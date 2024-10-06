package week6;

import java.util.Scanner;

public class ElectionsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[5];
        int spoiltVotes = 0;
        int totalBallots = 0;

        System.out.print("Enter the total number of ballots: ");
        totalBallots = scanner.nextInt();

        for (int i = 0; i < totalBallots; i++) {
            System.out.print("Enter the candidate number for ballot " + (i + 1) + ": ");
            int vote = scanner.nextInt();

            if (vote >= 1 && vote <= 5)
                count[vote - 1]++;
            else
                spoiltVotes++;
            }//for
        System.out.println("\nVote Count for Each Candidate:");
        for (int i = 0; i < count.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + count[i]);
        }//for
        System.out.println("Spoilt Votes: " + spoiltVotes);
    }//main
}//class