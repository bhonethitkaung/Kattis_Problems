package Kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildingPyramidsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1, 9, 25
        // 1^1, 3^3, 5^5

        int placed = 0;
        int left = n - placed;
        List<Integer> placedList = new ArrayList<>();

        for(int i=1; i<=n; i+=2) {
            if(i*i <= left) {
                placed += i*i;
                left = n - placed;
                placedList.add(placed);
            } else {
                break;
            }
        }
        System.out.println(placedList.size());

    }
}
