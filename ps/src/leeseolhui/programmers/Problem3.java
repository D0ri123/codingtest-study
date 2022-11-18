package leeseolhui.programmers;

//프로그래머스 - 소수 찾기
//1. 만들 수 있는 숫자 조합 생성
//2. 소수인지 판별하는 기능 생성

import java.util.HashSet;
import java.util.Iterator;

public class Problem3 {
    static HashSet<Integer> numberSet = new HashSet<>();

    public int Solution(String numbers){
        int answer = 0;
        permutation("", numbers);

        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(isPrime(num))
                answer++;
        }
        return answer;
    }

    public static void permutation(String origin, String others){
        if(!origin.equals("")) {
            numberSet.add(Integer.parseInt(origin));
        }
        for(int i=0; i<others.length(); i++){
            permutation(origin+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
    }

    public static boolean isPrime(int number){
        if(number == 0 || number == 1) return false;
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}
