package Kattis;

import java.util.Scanner;

public class NastyHacksProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            int r = sc.nextInt(); // revenue do not advertise
            int e = sc.nextInt(); // revenue advertise
            int c = sc.nextInt(); // cost of advertise
            sc.nextLine();
            if(r == (e-c)) {
                System.out.println("does not matter");
            } else if(r < (e-c)) {
                System.out.println("advertise");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
