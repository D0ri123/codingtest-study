package leeseolhui.stack_queue;

//후위식 연산

import java.util.Scanner;
import java.util.Stack;

public class Code04 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) {
                stack.push(ch-48);
            } else{
                int result;
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(ch == '+')
                    result = num1 + num2;
                else if(ch == '-')
                    result = num2 - num1;
                else if(ch== '*')
                    result = num1 * num2;
                else
                    result = num1 / num2;
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }
}
