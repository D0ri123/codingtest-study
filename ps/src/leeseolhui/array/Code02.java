package leeseolhui.array;

//보이는 학생

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n];

        for(int i=0; i<n; i++){
            students[i] = sc.nextInt();
        }
        System.out.println(solution(students));
    }

    public static int solution(int[] arr){
        int count = 1;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max) {
                count++;
                max = arr[i];
            }
        }
        return count;
    }
}
