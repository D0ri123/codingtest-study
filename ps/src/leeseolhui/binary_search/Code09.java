package leeseolhui.binary_search;

/**
 *  Least Recently Used(LRU)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code09 {
    public static int[] solution(int s, int[] work) {
        int[] cache = new int[s];
        for(int x : work){
            int pos = -1;
            for(int i=0; i<s; i++) {
                if(x==cache[i]) pos=i;
            }
            if(pos==-1){
                for(int i=s-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0]=x;
            } else{
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0]=x;
            }
        }
        return cache;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] work = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            work[i] = Integer.parseInt(st.nextToken()); //{1,2,3,2,6,2,3,5,7}
        }

        for(int a:solution(s,work)){
            sb.append(a).append(" ");
        }

        System.out.println(sb);

    }
}
