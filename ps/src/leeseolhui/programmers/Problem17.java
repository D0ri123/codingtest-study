package leeseolhui.programmers;

//숫자 게임

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args){
        Problem17 pro = new Problem17();
        int[] a = {5,1,3,7};
        int[] b = {2,2,6,8};
        System.out.println(pro.solution(a, b));
    }

    public int solution(int[] a, int[] b){
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        int n = a.length;

        int aPoint = 0;
        int bPoint = 0;
        for(int i=0; i<n; i++){
            if(a[aPoint] < b[bPoint]){
                answer++;
                aPoint++;
                bPoint++;
            } else if(a[aPoint] > b[bPoint] || a[aPoint] == b[bPoint]){
                bPoint++;
            }
        }
        return answer;
    }
}
