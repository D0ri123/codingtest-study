package leeseolhui.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
    int x;
    int y;

    Tomato(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Code12 {
    public static int m, n;
    public static int[][] graph = new int[1001][1001];
    public static int dx[] = {0, 0, -1, 1};
    public static int dy[] = {-1, 1, 0, 0};
    public static Queue<Tomato> q = new LinkedList<>();

    public static int bfs() {
        while (!q.isEmpty()) {
            Tomato tomato = q.poll();
            int x = tomato.x;
            int y = tomato.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx <= -1 || nx >= n || ny <= -1 || ny >= m) continue;
                if (graph[nx][ny] == -1) continue;
                if (graph[nx][ny] == 0) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Tomato(nx, ny));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0)
                    return -1;
                max = Math.max(max, graph[i][j]);
            }
        }
        if (max == 1)
            return 0;
        else
            return max - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 1) {
                    q.offer(new Tomato(i, j));
                }
            }
        }
        System.out.println(bfs());
    }
}