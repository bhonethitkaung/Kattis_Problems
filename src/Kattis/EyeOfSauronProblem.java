package Kattis;

import java.util.Scanner;

public class EyeOfSauronProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String firstSubString = s.substring(0, s.indexOf("("));
        String secondSubString = s.substring(s.indexOf(")") + 1);
        if(firstSubString.length() != secondSubString.length()) {
            System.out.println("fix");
        } else {
            System.out.println("correct");
        }
    }
}
