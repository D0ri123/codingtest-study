package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //가지고 있는 랜선의 개수
        int m = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수 N

        int[] line = new int[n];

        for(int i=0; i<n; i++){
            line[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(line);

        long result = 0;
        long low = 1;
        long high = line[n-1];
        while(low<=high){
            long ae=0;
            long mid = (low+high)/2;

            for(int a:line){
                ae += a/mid;
            }

            if(ae<m)
                high = mid-1;
            else if(ae>=m) {
                low = mid + 1;
                result = mid;
            }
        }
        System.out.println(result);
    }
}
