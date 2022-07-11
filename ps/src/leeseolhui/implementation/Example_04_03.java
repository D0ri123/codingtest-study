package leeseolhui.implementation;

import java.util.Scanner;

public class Example_04_03 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int row = s.charAt(1) - '0';
        int column = s.charAt(0) - 'a' + 1;
        int count = 0;

        int[] dx = {-2,-2,-1,1,2,2,-1,1};
        int[] dy = {1,-1,2,2,-1,1,-2,-2};

        for(int i=0; i<8; i++){
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            if(nextRow>=1 && nextRow<=8 && nextColumn>=1 && nextColumn<=8 ) count++;
        }
        System.out.println(count);
        }
    }
