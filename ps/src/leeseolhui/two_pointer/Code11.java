package leeseolhui.two_pointer;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Code11 {
    public static int solution(int n, int[] arr){
        ArrayList<liquid> list = new ArrayList<>();
        int lt = 0;
        int rt = n-1;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(lt<rt){
            sum = arr[lt] + arr[rt];
            int num = Math.abs(sum);
            if(num < min){
                list.add(new liquid(arr[lt], arr[rt], num));
                min = num;
                lt++;
            }else {
                rt--;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }



    }
}

class liquid{
    int x;
    int y;
    int val;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    liquid(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
}