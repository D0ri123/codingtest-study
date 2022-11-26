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
        String match = "[a-zA-Z]";
        String stringResult = word.replaceAll(match, "");
        int result = Integer.parseInt(stringResult);
        return result;
    }
}
