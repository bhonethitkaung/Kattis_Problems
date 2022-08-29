package Kattis;

import java.util.Scanner;

public class FilipProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String num1Result = "";
        String num2Result = "";
        for(int i=num1.length() - 1; i>=0; i--) {
            num1Result = num1Result.concat("" + num1.charAt(i));
        }
        for(int j=num2.length() - 1; j>=0; j--) {
            num2Result = num2Result.concat("" + num2.charAt(j));
        }
        System.out.println(Math.max(Integer.parseInt(num1Result), Integer.parseInt(num2Result)));

    }
}
