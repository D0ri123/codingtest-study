package leeseolhui.stack_queue;

import java.util.EmptyStackException;
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
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='(')
                s.push(input.charAt(i));
            else
                try{
                    s.pop();
                }catch(EmptyStackException e){
                    return "NO";
                }
        }
        return s.isEmpty() ? "YES": "NO";
    }
}
