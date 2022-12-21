package leeseolhui.dfs_bfs;

import java.util.*;

public class Code22 {
    public static int n, f;
    public static int[] arr, visited, nums;
    public static boolean flag = false;
    public static ArrayList<int[]> seqList = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //가장 윗줄에 있는 숫자의 개수
        f = sc.nextInt(); //가장 밑에 줄에 있는 수

        visited = new int[n];
        nums = new int[n];
        arr = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = i+1; //nums = {1,2,3,4}
        }
        DFS(0);
    }

    public static void DFS(int L){ //윗 줄의 숫자를 조합하는 경우
        if(L==n){
            solution(arr);
        }else{
            for(int i=0; i<n; i++) {
                if(visited[i] == 0) {
                    visited[i] = 1;
                    arr[L] = nums[i];
                    DFS(L+1);
                    visited[i] = 0;
                }
            }
        }
    }

    public static void solution(int[] arr){
        Queue<Integer> q = new LinkedList<>();
        if(flag) return;
        for(int number : arr){
            q.offer(number);
        }

        int[] result = new int[0];
        while(q.size()!=1){
            int num = q.poll();
            int len = q.size();
            result = new int[len];
            for(int i=0; i<len; i++){
                int num2 = q.poll();
                result[i] = num + num2;
                q.offer(result[i]);
                num = num2;
            }
        }

        if(result[0]==f) {
            for(int num : arr){
                System.out.print(num + " ");
            }
            flag = true;
        }
    }
}
