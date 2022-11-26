package leeseolhui.string;
//중복문자 제거
import java.util.*;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String str){
       String answer = "";
       for(int i=0; i<str.length(); i++){
           if(str.indexOf(str.charAt(i))==i)
               answer += str.charAt(i);
       }
        System.out.println(answer);
    }
}
