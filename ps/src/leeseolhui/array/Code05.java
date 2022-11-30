package leeseolhui.array;

//소수(에라토스테네스 체)

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        for(int i=3; i<=n; i++){
            if(solution(i)) count++;
        }
        System.out.println(count);
    }

    public static boolean solution(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if((n%i)==0)
                return false;
        }
        return true;
    }
}
