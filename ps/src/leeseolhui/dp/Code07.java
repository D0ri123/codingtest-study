package leeseolhui.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//최대점수 구하기(냅색)
class Problem implements Comparable<Problem>{
    int pScore;
    int pTime;

    public Problem(int ps, int pt){
        this.pScore = ps;
        this.pTime = pt;
    }
    @Override
    public int compareTo(Problem o){
        return this.pTime - o.pTime;
    }

}
public class Code07 {
    public static void main(String[] args) {
        ArrayList<Problem> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();

        for(int i=0; i<n; i++){
            int ps = sc.nextInt();
            int pt = sc.nextInt();
            list.add(new Problem(ps, pt));
        }
        System.out.println(solution(list, limit));
    }

    public static int solution(ArrayList<Problem> list, int limit){
        Collections.sort(list);

        int[] cache = new int[limit+1];
        for(int i=0; i<list.size(); i++){
            for(int j=cache.length-1; j>=list.get(i).pTime; j--){
                cache[j] = Math.max(cache[j], cache[j-list.get(i).pTime]+list.get(i).pScore);
            }
        }
        return cache[limit];
    }
}
