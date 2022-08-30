package Kattis;

import java.util.Scanner;

public class SMILProblem {
    public static void main(String[] args) {
        String[] smileList = {":)", ";)", ":-)", ";-)"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++) {
            for(String smile : smileList) {
                if(i + smile.length() <= s.length()) {
                    String tempString = s.substring(i, i + smile.length());
                    if(tempString.equals(smile)) {
                        System.out.println(i);
                        i = i + smile.length() - 1;
                        break;
                    }
                }
            }
        }
    }
}
