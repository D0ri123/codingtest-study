package leeseolhui.string;

//암호

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String password = sc.next();

        System.out.println(change(n,password));
    }

    public static String change(int n, String password){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = password.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            password = password.substring(7);
        }
        return answer;
    }
}
