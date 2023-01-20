package leeseolhui.programmers;

//억억단을 외우자

import java.util.*;

public class Problem21 {
    public static int[] result;
    public static void main(String[] args) {
        int e = 8; //임의의 수
        int[] starts = {1,3,7}; //임의의 수
        Problem21 pro = new Problem21();
        System.out.println(Arrays.toString(pro.solution(e, starts)));
    }

    public int[] solution(int e, int[] starts){
        int[] arr = new int[starts.length];
        settings(e);

        int max = 0;
        int minAddress = 0;
        for(int i=e; i>=0; i--){
            minAddress = max> result[i] ? minAddress : i;
            max = Math.max(max, result[i]);
            result[i] = minAddress;
        }

        for(int i=0; i< starts.length; i++){
            arr[i] = result[starts[i]];
        }

        return arr;
    }

    public void settings(int e){
        result = new int[e+1];
        for(int i=1; i<=e; i++){
            result[i] = count(i);
        }
    }

    public int count(int num){
        int result = 0;
        for(int i=1; i*i<=num; i++){
            if(i*i == num) result++;
            else if(num%i ==0) result+=2;
        }
        return result;
    }
}
