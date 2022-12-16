package leeseolhui.programmers;

//땅따먹기

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args){
        int[][] land = new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        Problem12 s = new Problem12();
        System.out.println(s.solution(land));
    }

    int solution(int[][] land){
        for(int l=1; l<land.length; l++){
            int[] arr = land[l];
            for(int i=0; i<4; i++){
                switch (i) {
                    case 0 -> arr[0] += Math.max(Math.max(land[l - 1][1], land[l - 1][2]), land[l - 1][3]);
                    case 1 -> arr[1] += Math.max(Math.max(land[l - 1][0], land[l - 1][2]), land[l - 1][3]);
                    case 2 -> arr[2] += Math.max(Math.max(land[l - 1][0], land[l - 1][1]), land[l - 1][3]);
                    case 3 -> arr[3] += Math.max(Math.max(land[l - 1][0], land[l - 1][1]), land[l - 1][2]);
                }
            }
        }

        int[] result = land[land.length-1];
        return Arrays.stream(result).max().getAsInt();
    }
}
