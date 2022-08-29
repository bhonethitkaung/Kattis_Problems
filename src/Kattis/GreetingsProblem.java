package Kattis;

import java.util.Scanner;

public class GreetingsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String subString = s.substring(1, s.length() - 1);
        System.out.println(subString);
        String result = "";
        for(int i=0; i<subString.length(); i++) {
            result = result.concat("ee");
            System.out.println(result);
        }
        System.out.println("h" + result + "y");
    }
}
