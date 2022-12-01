package leeseolhui.array;

//뒤집은 소수

import java.util.*;

public class Code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        solution(numbers);
    }

    public static void solution(int[] numbers){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            numbers[i] = calc(numbers[i]);
            if(isPrimeNumber(numbers[i]))
                sb.append(numbers[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static int calc(int number){
        StringBuilder answer = new StringBuilder();
        while(number>0){
            answer.append(number % 10);
            number /= 10;
        }
        return Integer.parseInt(answer.toString());
    }

    public static boolean isPrimeNumber(int number){
        if(number==2) return true;
        if(number==1) return false;
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
