package Kattis;

import java.util.Scanner;

public class DigitSwapProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";
        for(int i=s.length() - 1; i>=0; i--) {
            result = result.concat("" + s.charAt(i));
        }
        System.out.println(result);
    }
}
