package Kattis;

import java.util.Scanner;

public class ZamkaProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // l <= n <= d
        // l <= m <= d

        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        for(int i=l; i<=d; i++) {
            int sum = 0;
            int temp = i;
            boolean quit = false;
            while(temp > 0) {
                sum += temp%10;
                temp = temp/10;
                if(sum == x) {
                    System.out.println(i);
                    quit = true;
                    break;
                }
            }
            if(quit) {
                break;
            }
        }

        for(int i=d; i>=l; i--) {
            int sum = 0;
            int temp = i;
            boolean quit = false;
            while(temp > 0) {
                sum += temp%10;
                temp = temp/10;
            }
            if(sum == x) {
                System.out.println(i);
                quit = true;
                break;
            }
            if(quit) {
                break;
            }
        }
    }
}
