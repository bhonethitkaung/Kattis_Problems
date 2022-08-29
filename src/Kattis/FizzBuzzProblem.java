package Kattis;

import java.util.Scanner;

public class FizzBuzzProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%x == 0 && i%y == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%x == 0) {
                System.out.println("Fizz");
                continue;
            }
            if(i%y == 0) {
                System.out.println("Buzz");
                continue;
            }
            if(i%x != 0 && i%y != 0) {
                System.out.println(i);
            }
        }
    }
}
