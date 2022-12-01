package leeseolhui.array;

//등수 구하기

import java.util.Arrays;
import java.util.Scanner;

public class Code08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] scores = new Integer[n];
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }
        for(int score :solution(n, scores)){
            System.out.print(score + " ");
        }
    }

    public static int[] solution(int n, Integer[] arr){
        int[] result = new int[n];
        Arrays.fill(result, 1);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] < arr[j])
                    result[i]++;
            }
        }
        return result;
    }
}
