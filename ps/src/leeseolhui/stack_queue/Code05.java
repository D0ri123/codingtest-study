package leeseolhui.stack_queue;

// 쇠막대기

import java.util.Scanner;
import java.util.Stack;

public class Code05 {
    public static void main(String[] args){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') {
                stack.push('(');
            } else{
                stack.pop();
                if(str.charAt(i-1)=='('){
                    answer += stack.size();
                } else answer++;
            }
        }
        System.out.println(answer);
    }
}
