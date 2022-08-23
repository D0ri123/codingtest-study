package leeseolhui.dfs_bfs;
/*백준 1697 메모리 초과..*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code11 {
    public static int n, k;
    public static int[] check = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        if (n == k)
            System.out.println(0);
        else
            bfs(n);
    }

    public static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(num);
        check[num] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == k) {
                    System.out.println(check[temp]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.offer(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }
}

//    내가 한 풀이 자꾸 메모리 초과 발생함.
//    public static int n,k;
//    public static ArrayList<Integer> order = new ArrayList<>();
//
//    public static int search(int n){
//        int result = 0;
//        for(int i=0;;i++){
//            int cut = (int)Math.pow(3,i);
//            result += cut;
//            if(n <= result) return i;
//        }
//    }
//
//    public static void bfs(int x, int target){
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(x);
//        while(!q.isEmpty()) {
//            int num = q.poll();
//            order.add(num);
//            if(num==target) break;
//            q.offer(num - 1);
//            q.offer(num + 1);
//            q.offer(num * 2);
//        }
//       System.out.println(search(order.size()));
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String a = br.readLine();
//        String[] str = a.split(" ");
//
//        n = Integer.parseInt(str[0]);
//        k = Integer.parseInt(str[1]);
//        bfs(n,k);
//    }

