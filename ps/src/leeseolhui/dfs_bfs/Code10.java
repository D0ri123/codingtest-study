package leeseolhui.dfs_bfs;
/*백준 2468*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code10 {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        int max = 0;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }

        int answer = 0;
        for(int i=1; i<=max; i++){
            int cnt=0;
            visited = new boolean[n+1][n+1];
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    if(!visited[j][k] && map[j][k]>=i){
                        cnt++;
                        dfs(i,j,k);
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }

    private static void dfs(int height, int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<1 || ny<1 || nx>n || ny>n) continue;
            if(!visited[nx][ny] && map[nx][ny]>=height) {
                visited[nx][ny] = true;
                dfs(height, nx, ny);
            }
        }
    }
}
