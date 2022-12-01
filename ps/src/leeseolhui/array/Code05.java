package leeseolhui.array;

//소수(에라토스테네스 체)

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int count = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0) {
                count++;
                for(int j=i; j<=n; j=j+i)
                    ch[j] = 1;
            }
        }
        return count;
    }
}
