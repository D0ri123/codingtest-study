package leeseolhui.baekjoon.level07;

import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        int[][] result = new int[15][15];
        for(int i=0; i<15; i++){ // 0층의 호수만큼 인원을 채워주고, 각 층의 1호에는 1명만 채워준다.
            result[i][1] = 1;
            result[0][i] = i;
        }

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){ //규칙을 활용해서 각 배열들에 숫자를 채워넣는다.
                result[i][j] = result[i][j-1] + result[i-1][j];
            }
        }

        for(int i=0; i<test; i++){
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            System.out.println(result[a][b]);
        }

    }
}

