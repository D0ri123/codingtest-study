package algorithm_ps_strategies.brute_force;

//0번부터 차례대로 번호 매겨진 n개의 원소 중 네개를 고르는 모든 경우를 출력하라.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Code01 {
    public static int n;
    public static int[] result, check;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = new int[4];
        check = new int[n];
        for(int i=0; i<=n; i++){
            list.add(i);
        }
        DFS(0);
    }
    public static void DFS(int L){
        if(L == result.length){
            System.out.println(Arrays.toString(result));
        } else{
            for(int i=0; i<n; i++){
                if(check[i]==0) {
                    result[L] = list.get(i);
                    check[i] = 1;
                    DFS(L+1);
                    check[i] = 0;
                }
            }
        }
    }
}
