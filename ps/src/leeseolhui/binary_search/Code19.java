package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code19 {
    public static int cnt;
    public static void solution(int[] arr, int index){
        int lt=0, rt=arr.length-1;
        int target = arr[index];

        while(lt<rt){
            if(lt==index) lt++;
            else if(rt==index) rt--;

            else{
                if(target>arr[lt]+arr[rt]) lt++;
                else if(target == arr[lt]+arr[rt]){
                    cnt++;
                    return;
                }else rt--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            solution(arr,i);
        }

        sb.append(cnt);
        System.out.println(sb);
        br.close();
    }
}
