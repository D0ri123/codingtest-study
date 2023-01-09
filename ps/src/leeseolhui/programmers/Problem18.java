package leeseolhui.programmers;

//입국심사

import java.util.Arrays;

public class Problem18 {
    public static void main(String[] args){
        Problem18 pro = new Problem18();
        int n = 6;
        int[] times = {7,10};
        System.out.println(pro.solution(n, times));
    }
    public long solution(int n, int[] times){
        int start = 0;
        int end = Arrays.stream(times).max().getAsInt();
        int result = 0;

        while(start<=end){
            int mid = (start + end)/2;
            int people = 0;
            for(int time: times){
                people += mid/time;
            }
            if(people<n) start = mid+1;
            else if(people>n) end = mid-1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }
}
