package algorithm_ps_strategies.brute_force;

//보글게임
import java.util.Scanner;

public class Code02 {
    public static int[] dx = {-1,-1,-1,1,1,1,0,0};
    public static int[] dy = {-1,0,1,-1,0,1,-1,1};
    public static char[][] game;
    public static String[] str;

    public static boolean hasWord(int x, int y, String word){
        if(x<0 || y<0 || x>=5 || y>=5) return false;
        if(word.charAt(0) != game[x][y]) return false;
        if(word.length()==1) return true;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(hasWord(nx, ny, word.substring(1))) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        game = new char[5][5];

        for(int i=0; i<c; i++) {
            for (int j = 0; j < 5; j++) {
                String str = sc.next();
                game[j] = str.toCharArray();
            }

            int n = sc.nextInt();
            str = new String[n];
            for(int s=0; s<n; s++){
                str[s] = sc.next();
            }

            for(int next=0; next<str.length; next++){
                System.out.print(str[next] + " ");
                boolean flag = false;
                for(int j=0; j<5; j++){
                    for(int k=0; k<5; k++){
                        if(hasWord(j,k,str[next])){
                            flag = true;
                            break;
                        }
                    }
                    if(flag) break;
                }
                if(flag) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
