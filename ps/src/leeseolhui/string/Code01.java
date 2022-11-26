package leeseolhui.string;

//특정 문자 뒤집기

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String answer){
        int lt = 0;
        int rt = answer.length()-1;

        char[] chars = answer.toCharArray();

        while(lt<rt){
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else{
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }
}
