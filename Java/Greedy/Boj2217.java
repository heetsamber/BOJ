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
        max = arr[0];                   // 최대 무게

        for(int i = 1; i < n; i++){
            
            int cur = arr[i] * (i + 1); // 현재 i 번째 로프까지 들 수 있는 최대 무게
            if(cur > max) {             // 기존 무게보다 많이 들 수 있다면 갱신
                max = cur;
            }
        }
        System.out.print(max);
    }
}
