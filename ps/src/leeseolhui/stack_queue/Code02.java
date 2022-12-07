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
            if(x=='(')
                stack.push(x);
            if(x==')') {
                stack.pop();
            }
            if(stack.isEmpty() && Character.isAlphabetic(x))
                sb.append(x);
        }
        System.out.println(sb);
    }
}
