package leeseolhui.array;

//점수계산

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }

        solution(scores);
    }

    public static void solution(int[] scores){
        int[] scoreTable = new int[scores.length];
        int count = 1;
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i]==1)
                scoreTable[i] = count++;
            if(scores[i]==0) {
                scoreTable[i] = 0;
                count = 1;
            }
        }

        for(int eachScore : scoreTable){
            sum += eachScore;
        }
        System.out.println(sum);
    }
}
