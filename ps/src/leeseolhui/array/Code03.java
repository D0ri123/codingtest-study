package leeseolhui.array;

//가위 바위 보

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        solution(n, a, b);
    }

    public static void solution(int n, int[] player1, int[] player2){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(player1[i]==player2[i])
                sb.append("D").append("\n");
            else if(player1[i]==1 && player2[i]==3)
                sb.append("A").append("\n");
            else if(player1[i]==2 && player2[i]==1)
                sb.append("A").append("\n");
            else if(player1[i]==3 && player2[i]==2)
                sb.append("A").append("\n");
            else
                sb.append("B").append("\n");
        }
        System.out.println(sb);
    }
}
