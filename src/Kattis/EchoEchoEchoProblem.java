package Kattis;

import java.util.Scanner;

public class EchoEchoEchoProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        for(int i=0; i<3; i++) {
            result = result.concat(word + " ");
        }
        System.out.println(result);
        sc.close();
    }
}
