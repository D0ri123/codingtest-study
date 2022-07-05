package leeseolhui.baekjoon.level03;

import java.io.*;

public class Code04 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();

        for(int i=1; i<=Integer.parseInt(a); i++){
            String s = br.readLine();
            String arr[] = s.split(" ");
            int sum = 0;
            for(int j=0; j<2; j++){
                sum += Integer.parseInt(arr[j]);
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
