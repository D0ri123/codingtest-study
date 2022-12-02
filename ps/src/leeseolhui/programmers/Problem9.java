package leeseolhui.programmers;

// 2*n 타일링

import java.util.Scanner;

public class Problem9 {
    public static int[] dy;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(solution(n));
    }

    public static int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++){
            dy[i] = (dy[i-1] + dy[i-2]) % 1000000007;
        }
        return dy[n];
    }
}
