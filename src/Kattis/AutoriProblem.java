package Kattis;

import java.util.Scanner;

public class AutoriProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for(String temp : s.split("-")) {
            result += temp.charAt(0);
        }
        System.out.println(result);
    }
}
