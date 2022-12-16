package leeseolhui.programmers;

//점프와 순간 이동

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int[] cache = new int[n+1];
        cache[1] = 1;
        cache[2] = 1;
        for(int i=3; i<=n;i++){
            if(i%2 != 0){
                cache[i] = cache[i-1] + 1;
            } else {
                cache[i] = cache[i/2];
            }
        }
        return cache[n];
    }
}
