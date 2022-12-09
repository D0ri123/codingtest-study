package leeseolhui.programmers;

// 타겟 넘버

public class Problem10 {
    public static int answer = 0;
    public static int solution(int[] numbers, int target){
        dfs(numbers, 0, 0, target);
        return answer;
    }

    public static void dfs(int[] numbers, int n, int level, int target){
        if(level==numbers.length){
            if (n == target) {
                answer++;
            }
        } else {
            int n1 = n+numbers[level];
            int n2 = n-numbers[level];
            dfs(numbers, n1, level+1, target);
            dfs(numbers, n2, level+1, target);
        }
    }
}