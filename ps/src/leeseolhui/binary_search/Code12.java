package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Code12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] grid = new int[n][2];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            grid[i][0] = Integer.parseInt(st.nextToken());
            grid[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(grid, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return Integer.compare(o1[1], o2[1]);
                } else
                    return Integer.compare(o1[0], o2[0]);
            }
        });

        for(int i=0; i<n; i++){
            sb.append(grid[i][0]).append(" ").append(grid[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
