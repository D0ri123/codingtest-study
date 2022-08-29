package leeseolhui.binary_search;

/*baekjoon 2512*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] budget = new int[n];

        String str = br.readLine();
        String[] strings = str.split(" ");

        for(int i=0; i<n; i++){
            budget[i] = Integer.parseInt(strings[i]);
        }

        int sum = Integer.parseInt(br.readLine());

        Arrays.sort(budget);

        int low = 1;
        int high = budget[n-1];
        int ans = 0;

        while(low<=high){
            int result = 0;
            int mid = (low+high)/2;
            for(int a:budget){
                if(a>mid)
                    result += mid;
                else
                    result += a;
            }

            if(result<=sum){
                low = mid+1;
                ans = mid;
            } else{
                high = mid-1;
            }
        }

        System.out.println(ans);
    }
}
