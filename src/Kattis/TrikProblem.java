package Kattis;

import java.util.Scanner;

public class TrikProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] ball = {1,0,0};
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int temp;
            switch(c) {
                case 'A':
                    temp = ball[0];
                    ball[0] = ball[1];
                    ball[1] = temp;
                    break;
                case 'B':
                    temp = ball[1];
                    ball[1] = ball[2];
                    ball[2] = temp;
                    break;
                case 'C':
                    temp = ball[0];
                    ball[0] = ball[2];
                    ball[2] = temp;
                    break;
                default:
            }
        }
        for(int i=0; i<ball.length; i++) {
            if(ball[i] == 1) {
                System.out.println(i + 1);
            }
        }
    }
}
