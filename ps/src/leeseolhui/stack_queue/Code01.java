package leeseolhui.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        System.out.println(solution(input, stack));
    }

    public static String solution(String input, Stack<Character> s){
        for(char x : input.toCharArray()){
            if(x=='(')
                s.push(x);
            else
                if(s.isEmpty()) return "NO";
                s.pop();
        }
        return s.isEmpty() ? "YES": "NO";
    }
}
