package Kattis;

import java.util.Scanner;

public class BijeleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] correctOrder = {1, 1, 2, 2, 2, 8};
        int[] inputOrder = new int[6];
        for(int i=0; i<6; i++) {
            inputOrder[i] = sc.nextInt();
        }
        for(int j=0; j<6; j++) {
            System.out.print((correctOrder[j] - inputOrder[j]) + " ");
        }

    }
}
