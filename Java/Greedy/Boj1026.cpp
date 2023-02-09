
import java.util.*;

// 배열 a는 오름차순 b는 내림차순 정렬할 경우 가장 작은수가 만들어짐
// 큰 수와 작은 수를 곱해야 가장 작은 수가 나오기 떄문
// example_) 0 1 1 1 6             a 오름차순
//           8 7 3 2 1             b 내림차순
public class Main{
    public static void main(String[] args){
        int n, result = 0;
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            b.add(sc.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            result += a.get(i) * b.get(i);
        }
        System.out.println(result);
    }
}
