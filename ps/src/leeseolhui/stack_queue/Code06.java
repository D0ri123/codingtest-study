package leeseolhui.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기

public class Code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){
            q.offer(i);
        }

        while(q.size() != 1) {
            for(int i=0; i<k; i++){
                if(i==k-1){
                    q.poll();
                } else {
                    int a = q.poll();
                    q.offer(a);
                }
            }
        }
        System.out.println(q.poll());
    }
}
