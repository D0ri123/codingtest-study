package leeseolhui.programmers;

//네트워크, union-find 사용

import java.util.Scanner;

public class Problem15 {
    public static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] computers = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                computers[i][j] = sc.nextInt();
            }
        }
        Problem15 pro = new Problem15();
        System.out.println(pro.solution(n, computers));
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(computers[i][j] == 1 && computers[j][i] == 1) union(i, j);
            }
        }

        for(int i=0; i<n; i++){
            if(parent[i]==i) answer++;
        }
        return answer;
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a==b) return;
        parent[a] = b;
    }

    public static int find(int a){
        if(a == parent[a]) return a;
        return parent[a] = find(parent[a]);
    }
}
