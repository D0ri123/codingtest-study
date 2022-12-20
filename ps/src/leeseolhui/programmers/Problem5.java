package leeseolhui.programmers;

//피로도
//현재 피로도 k, 각 던전 별 피로도 - 최소 필요 피로도, 소모 피로도
public class Problem5 {
    public static boolean[] visited;
    public static int answer = 0;

    public static void dfs(int depth, int k, int[][] dungeons){
        for(int i=0; i<dungeons.length ; i++){
            if(!visited[i] && dungeons[i][0]<=k){
                visited[i] = true;
                dfs(depth+1, k-dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

    public int solution(int k, int[][] dungeons){
        int depth = 0;
        visited = new boolean[dungeons.length+1];
        dfs(depth, k, dungeons);
        return answer;
    }
}
