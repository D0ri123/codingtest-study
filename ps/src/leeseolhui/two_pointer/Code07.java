package leeseolhui.two_pointer;

import java.util.ArrayList;
import java.util.Scanner;

public class Code07 {
    public static int solution(int n){
        int cnt = 0;
        ArrayList<Integer> lt = new ArrayList<>();
        int sum = 0;
        for(int rt=1; rt<n; rt++) {
            sum += rt;
            lt.add(rt);
            if (sum == n) cnt++;
            while (sum >= n) {
                sum -= lt.get(0);
                lt.remove(0);
                if (sum == n) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
