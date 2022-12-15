package leeseolhui.samsung;

//거의 제곱 고리

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
    public static ArrayList<Integer> list;
    public static int[] arr, check;
    public static int n, m;
    public static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            max = Integer.MIN_VALUE;
            n = sc.nextInt();
            arr = new int[n];
            check = new int[n];
            check[0] = 1;
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            list = new ArrayList<>();
            list.add(arr[0]);
            DFS(1);
            System.out.printf("#%d %d", i, max);
            System.out.println();
        }
    }

    public static void DFS(int L){
        if(L==n){
            max = Math.max(max, count(list));
        }else {
            for(int i=1; i<n; i++){
                if(check[i]==0){
                    check[i]=1;
                    list.add(arr[i]);
                    DFS(L+1);
                    check[i]=0;
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
    }

    public static int count(ArrayList<Integer> list){
        int count = 0;
        for(int i=0; i<list.size(); i++) {
            if (i == list.size() - 1) {
                double sum = Math.sqrt(list.get(i) + list.get(0));
                if (sum == (int) sum) count++;
            } else {
                double sum1 = Math.sqrt(list.get(i) + list.get(i + 1));
                if (sum1 == (int) sum1) count++;
            }
        }
        return count;
    }
}
