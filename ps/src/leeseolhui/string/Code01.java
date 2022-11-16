package leeseolhui.string;

//특정 문자 뒤집기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String answer){
        StringBuilder sb = new StringBuilder();

        char[] chars = answer.toCharArray();
        boolean[] isChar = new boolean[chars.length];
        List<Character> list = new ArrayList<>();

        Arrays.fill(isChar, false);

        for(int i=0; i<chars.length; i++){
            char alphabet = chars[i];
            if((alphabet>=65 && alphabet<=90) || (alphabet>=97 && alphabet<=122)){
                list.add(alphabet);
                isChar[i] = true;
            }
        }

        int lastIdx = list.size()-1;
        for(int i=0; i<chars.length; i++){
            if(isChar[i])
                sb.append(list.get(lastIdx--));
            else
                sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
