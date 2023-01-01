package leeseolhui.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code07 {
    public static Queue<Character> q;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String curriculum = sc.nextLine();
        String plan = sc.nextLine();

        System.out.println(solution(curriculum, plan));
    }

    public static String solution(String curriculum, String plan){
        q = new LinkedList<>();
        for(Character ch : curriculum.toCharArray()){
            q.offer(ch);
        }

        for(Character ch : plan.toCharArray()){
            if(q.contains(ch)){
                Character character = q.poll();
                if(ch != character){
                    return "NO";
                }
            }
        }

        if(!q.isEmpty()) return "NO";
        return "YES";
    }
}
