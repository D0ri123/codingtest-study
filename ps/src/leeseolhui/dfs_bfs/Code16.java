package leeseolhui.dfs_bfs;

//송아지 찾기(BFS: 상태트리탐색)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position{
    int pos;
    public Position(int pos){
        this.pos = pos;
    }
}

public class Code16 {
    public static int[] dx = {1, -1, 5};
    public static boolean[] check = new boolean[10001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        solution(s, n);
    }

    public static void solution(int s, int n){
        Queue<Position> result = new LinkedList<>();
        Arrays.fill(check, true);

        Position person = new Position(s);
        result.offer(person);
        check[person.pos] = false;

        int level = 0;
        while(!result.isEmpty()){
            int len = result.size();
            for(int j=0; j<len; j++) {
                Position position = result.poll();
                for(int i=0; i<3; i++){
                    int nx = position.pos + dx[i];
                    if(nx==n) {
                        System.out.println(level+1);
                        return;
                    }
                    if(nx>=1 && nx<=10000 && check[nx]){
                        result.offer(new Position(nx));
                        check[nx] = false;
                    }
                }
            }
            level++;
        }
    }
}

