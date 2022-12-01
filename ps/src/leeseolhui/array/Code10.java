package leeseolhui.array;

//봉우리

import java.util.Scanner;

public class Code10 {
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] field = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                field[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, field));
    }

    public static int solution(int n, int[][] field){
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                    if(field[nx][ny] >= field[i][j]) flag = false;
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
}
