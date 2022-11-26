package leeseolhui.programmers;

//모음사전

public class Problem7 {
    public static String str = "AEIOU";
    public static int[] rule = {781,156,31,6,1};
    public int solution(String word){
        int answer = word.length();

        for(int i=0; i<word.length(); i++){
            int index = str.indexOf(word.charAt(i));
            answer += rule[i] * index;
        }
        return answer;
    }
}
