package leeseolhui.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * baekjoon 1931
 */

public class Code02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //회의 개수

        int[][] conf = new int[n][2];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            String[] num = input.split(" ");
            conf[i][0] = Integer.parseInt(num[0]);
            conf[i][1] = Integer.parseInt(num[1]);
        }

        Arrays.sort(conf, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                    return o1[0]-o2[0];
                return o1[1] - o2[1];
            }
        });
/**
 * 내가 한 풀이(시간 초과 발생)
 */
//        int end;
//        int result=0;
//        for(int i=0; i<n; i++){
//            int count = 1;
//            end = conf[i][1];
//            for(int j=i+1; j<n; j++){
//                if(end <= conf[j][0]){
//                    end = conf[j][1];
//                    count++;
//                }
//                result = Math.max(result, count);
//            }
//        }

        int result = 0;
        int end = -1;
        for(int i=0; i<n; i++){
            if(conf[i][0]>=end){
                end = conf[i][1];
                result++;
            }
        }
        System.out.println(result);
    }
}
