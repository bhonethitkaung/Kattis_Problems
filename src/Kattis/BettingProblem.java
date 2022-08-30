package Kattis;

import java.util.Scanner;

public class BettingProblem {

    public static void main(String[] args) {

        // Player 1 => 10 (option 1) => 10/40 * 100 = 25%
        // Player 2 => 30 (option 1) => 30/40 * 100 = 75%
        // Player 3 => 10 (option 2) => 100%

        // Option 1 => 40/50 * 100 = 80%
        // Option 2 => 10/50 * 100 = 20%

        // Option 1 win
        // Player 1 => 10 + 25% of 10 = 12.5 => ratio 1:1.25
        // Player 2 => 30 + 75% of 10 = 37.5 => ratio 1:1.25

        // Option 2 win
        // Player 3 => 10 + 100% of 40 = 50 => ratio 1:5

        Scanner sc = new Scanner(System.in);
        int option1Percentage = sc.nextInt();

        int option2Percentage = 100 - option1Percentage;

        // Player 1 => 10 (option 1) => 25%
        // Player 2 => 30 (option 1) => 75%
        // Player 3 => 10 (option 2) => 100%

        // option 1 => 15%
        // option 2 => 85%

        // option 1 win
        // Player 1 => 10 + 25% of 10 = 12.5 => ratio 1:1.25
        // Player 2 => 30 + 75% of 10 = 37.5 => ratio 1:1.25







    }
}
