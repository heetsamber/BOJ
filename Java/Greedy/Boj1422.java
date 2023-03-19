package boj;

import java.util.*;

public class Boj1422 {
    public static void main(String[] args){
        int k = 0, n = 0;
        String temp = "";
        ArrayList<String> ans = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        String maxNum = "";    // 가장 긴 숫자를 저장하기 위한 변수

        for(int i = 1; i <= k; i++){
            temp = sc.next();
            // maxNum < temp  비교
            boolean isGreaterThan = maxNum.compareTo(temp) < 0 ? true : false;

            // 가장 길이가 긴 숫자를 고르는 작업
            if(maxNum.length() < temp.length() || maxNum.length() == temp.length() && isGreaterThan){
                maxNum = temp;
            }
            ans.add(temp);
        }

        // 제일 긴 숫자를 이어 붙이는게 가장 큰 수를 만들기 때문에 이어 붙인다
        for(int i = 0; i < n - k; i++){
            ans.add(maxNum);
        }

        // "100" + "10" 보다 "10" + "100" 이 크기 때문에
        // a + b > b + a 를 비교하기 위한 compare 선언
        // Example
        // 98 999    999 98
        // 8 999    999 8
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String tmp = o2 + o1;
                return tmp.compareTo(o1 + o2);
            }
        };

        Collections.sort(ans, compare);

        for(var i : ans){
            System.out.print(i);
        }

    }
}
