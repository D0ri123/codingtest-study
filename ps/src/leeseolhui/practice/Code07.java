package leeseolhui.linked_list;

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int x = 1;
        int y = 1;
        int[] moveX = {0,0,-1,1};
        int[] moveY = {1,-1,0,0};
        char[] moveType = {'R','L','U','D'};
        for(int i=0; i<str.length; i++){
            char plan = str[i].charAt(0);
            int nx=-1; int ny=-1;
            for(int j=0; j<4; j++){
                if(plan == moveType[j]){
                    nx = x + moveX[j];
                    ny = y + moveY[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
