package leeseolhui.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int studentsNum = Integer.parseInt(sc.next());
        int examNum = Integer.parseInt(sc.next());

        int[][] record = new int[examNum][studentsNum];
        for(int i=0; i<examNum; i++){
            for(int j=0; j<studentsNum; j++){
                record[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(record));
    }

    public static int solution(int[][] record){
        List<Integer> list = new ArrayList<>();
        int[] one = record[0];
        for(int a: one){
            list.add(a);
        }

        for(int i=1; i<record.length; i++){
            for(int j=0; j<record[i].length; j++){

            }
        }

        return 1;
    }
}
