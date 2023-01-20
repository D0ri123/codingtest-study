package leeseolhui.programmers;

//표현 가능한 이진트리

import java.util.Arrays;

public class Problem20 {
    public static void main(String[] args) {
        Problem20 sol = new Problem20();
        long[] arr = {63,111,95};
        int[] result = sol.solution(arr);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(long[] numbers){
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            String str = toBinary((int)numbers[i]);
            if(checkTree(str)) answer[i] = 1;
            else answer[i] = 0;
        }
        return answer;
    }

    public String toBinary(int number){
        return Integer.toBinaryString(number);
    }

    public boolean checkTree(String binaryStr){
        int len = binaryStr.length();
        int root = (len-1)/2;
        if(len%2 == 0){
            if(binaryStr.charAt(root)=='0') return false;
            for(int i=0; i<len; i+=2){
                checkBinary(binaryStr, i, len);
            }
        } else{
            if(binaryStr.charAt(root)=='0') return false;
            for(int i=1; i<len; i+=2){
                checkBinary(binaryStr, i, len);
            }
        }
        return true;
    }

    public boolean checkBinary(String binaryStr, int i, int len){
        if(binaryStr.charAt(i)=='0') {
            if(i-1<0 && binaryStr.charAt(i+1)!='0') return false;
            else if(i+1>=len && binaryStr.charAt(i-1)!='0') return false;
            else if(binaryStr.charAt(i-1)!='0' || binaryStr.charAt(i+1)!='0') return false;
        }
        return true;
    }
}
