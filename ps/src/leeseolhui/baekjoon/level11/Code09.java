package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Code09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] members = new String[n][2];

        for(int i=0; i<n; i++){
            String member = br.readLine();
            String[] arr = member.split(" ");
            members[i][0] = arr[0];
            members[i][1] = arr[1];
        }

        Arrays.sort(members, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//                if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
//                    return Integer.parseInt(o1[0]);
//                } else
//                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);//
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(members[i][0] + " " + members[i][1]);
        }
    }
}

