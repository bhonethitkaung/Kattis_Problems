package Kattis;

import java.util.Scanner;

public class FYIProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num/10000 == 555) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
