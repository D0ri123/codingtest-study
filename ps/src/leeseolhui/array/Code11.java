package leeseolhui.array;

import java.util.*;

public class Code11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] students = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                students[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, students));
    }

    public static int solution(int n, int[][] students){
        List<Integer> result = new ArrayList<>();
        for(int personal=0; personal<n; personal++){
            int count = 0;
            for(int others=0; others<n; others++) {
                for (int grade = 0; grade < 5; grade++) {
                    int a = students[personal][grade];
                    if (a == students[others][grade]) {
                        count++;
                        break;
                    }
                }
            }
            result.add(count);
        }

        int max = Integer.MIN_VALUE;
        for(int counted : result){
            max = Math.max(max, counted);
        }
        return result.indexOf(max)+1;
    }
}
