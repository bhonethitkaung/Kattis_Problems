package Kattis;

import java.util.Scanner;

public class FindingAnAProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String subString = s.substring(s.indexOf("a"));
        System.out.println(subString);
    }
}
