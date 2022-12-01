package leeseolhui.array;

//점수계산

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }
        solution(scores);
    }

    public static void solution(int[] scores){
        int count = 0;
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i]==1) {
                count++;
                sum += count;
            } else if(scores[i]==0)
                count=0;
        }
        System.out.println(sum);
    }
}
