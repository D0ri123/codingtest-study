package leeseolhui.implementation;

import java.util.Scanner;

public class Example_04_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plan = sc.nextLine().split("");
        int x = 1;
        int y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] movetype = {'L', 'R', 'U', 'D'};

        for(int i=0; i<plan.length; i++){
            char comp = plan[i].charAt(0);
            int nx = 0;
            int ny = 0;
            for(int j=0; j<4; j++){
                if(comp == movetype[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx<1 || ny<1 || nx>n || ny>n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
