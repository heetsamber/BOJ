import java.util.Scanner;

public class Main{
    public static int sol(int n, int row, int column){
        if(n == 0) return 0;

        int half = 1 << (n - 1);
        //<1번> 행과 열의 인덱스가 사각형의 경계(한 변의 절반)보다 작아야함.
        // 인덱스는 0번부터 시작
        if(row < half && column < half) return sol(n - 1, row, column);
        //<2번> 행이 half 작고 열이 half보다 크거나 같아야함
        if(row < half && column >= half) return half * half + sol(n - 1, row, column - half);
        //<3번> 행이 half보다 크고 열이 half보다 작아야함.
        if(row >= half && column < half) return 2 * half * half + sol(n - 1,row-half,column);

        //<4번> 1,2,3을 제외한 4번째 공간 리턴
        return 3 * half * half + sol(n - 1, row - half, column - half);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,r,c;
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println(sol(n, r, c));
  }
}
