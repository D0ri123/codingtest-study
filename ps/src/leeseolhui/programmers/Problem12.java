package leeseolhui.programmers;

//땅따먹기

public class Problem12 {
    public static int[][] land;
    public static int[][] check;
    public static int sum = 0;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args){
        Problem12 main = new Problem12();
        land = new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(main.solution(land));
    }

    int solution(int[][] land){
        int answer;
        check = new int[land.length+1][land[0].length];

        for(int i=0; i<land[0].length; i++){
            sum += land[0][i];
            BFS(0, i);
        }
        answer = max;
        return answer;
    }

    void BFS(int L, int idx){
        if(L==land.length){
            max = Math.max(max, sum);
            sum = 0;
        }else{
            check[L][idx] = 1;
            for(int i=0; i<check.length; i++){
                if(check[L][i] == 0){
                    check[L][i] = 1;
                    sum += land[L][i];
                    BFS(L+1, i);
                    check[L][i] = 0;
                }
            }
        }
    }
}
