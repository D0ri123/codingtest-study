package leeseolhui.binary_search;

/**
 * baekjoon 12015 - 가장 긴 증가하는 부분 수열2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Code21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> list = new ArrayList<>();
        list.add(0);

        int n = Integer.parseInt(br.readLine());

        int value, left, right, mid, end;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            value = Integer.parseInt(st.nextToken());
            end = list.size()-1;
            if(value > list.get(end)) list.add(value);
            else{
                left = 0;
                right = end;
                while(left<right){
                    mid = (left+right)/2;
                    if(value<=list.get(mid)) right = mid;
                    else left = mid+1;
                }
                list.set(right, value);
            }
        }
        System.out.println(list.size()-1);
    }
}
