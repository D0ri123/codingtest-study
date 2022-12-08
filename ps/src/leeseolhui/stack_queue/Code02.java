package leeseolhui.stack_queue;

//괄호문자 제거

import java.util.Scanner;
import java.util.Stack;

public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char x : input.toCharArray()){
            if(x==')') {
                while(stack.pop()!='(');
            } else
                stack.push(x);
        }
        for(Character ch : stack){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
