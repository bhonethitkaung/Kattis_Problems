package Kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BelaProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        sc.nextLine();

        Map<Character, Integer> dominantMap = new HashMap<>();
        dominantMap.put('A', 11);
        dominantMap.put('K', 4);
        dominantMap.put('Q', 3);
        dominantMap.put('J', 20);
        dominantMap.put('T', 10);
        dominantMap.put('9', 14);
        dominantMap.put('8', 0);
        dominantMap.put('7', 0);

        Map<Character, Integer> notDominantMap = new HashMap<>();
        notDominantMap.put('A', 11);
        notDominantMap.put('K', 4);
        notDominantMap.put('Q', 3);
        notDominantMap.put('J', 2);
        notDominantMap.put('T', 10);
        notDominantMap.put('9', 0);
        notDominantMap.put('8', 0);
        notDominantMap.put('7', 0);

        int result = 0;
        for(int i=0; i<n*4; i++) {
            String descriptionTemp = sc.nextLine();
            char tempChar = descriptionTemp.charAt(1);

            if(tempChar > c) {
                result += dominantMap.get(descriptionTemp.charAt(0));
            } else {
                result += notDominantMap.get(descriptionTemp.charAt(0));
            }
        }
        System.out.println("result " + result);
    }
}
