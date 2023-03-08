package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Boj2217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        max = arr[0];

        for(int i = 1; i < n; i++){
            int cur = arr[i] * (i + 1);
            if(cur > max) {
                max = cur;
                continue;
            }
        }
        System.out.print(max);
    }
}
