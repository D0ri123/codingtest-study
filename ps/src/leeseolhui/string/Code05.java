package leeseolhui.string;

// 숫자만 추출

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }

    public static int solution(String word){
        int answer = 0;
        for (char ch : word.toCharArray()){
            if(ch >= 48 && ch <= 57) answer = answer * 10 + (ch-48);
        }
        return answer;
    }
}
