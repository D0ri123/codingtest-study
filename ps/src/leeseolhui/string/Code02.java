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
       Set<String> set = new HashSet<>();
       int initSize = 0;
       StringBuilder sb = new StringBuilder();

       for(String s:str.split("")){
           set.add(s);
           if(set.size() != initSize) {
               initSize = set.size();
               sb.append(s);
           }
       }

        System.out.println(sb);
    }
}
