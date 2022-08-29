package Kattis;

import java.util.Scanner;

public class CountTheVowelsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int result = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
