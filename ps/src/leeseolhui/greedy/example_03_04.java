package leeseolhui.greedy;

import java.util.Scanner;

public class example_03_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k = sc.nextInt();

        int i = 0;

        while(n != 1) {
            if ((n % k) != 0) { //n이 k의 배수가 될 때까지 (-)연산을 해준다.
                n = n - 1;
                i++;
            } else if ((n % k) == 0) {
                n = n / k;
                i++;
            }
        }
        System.out.println(i);
    }

}
