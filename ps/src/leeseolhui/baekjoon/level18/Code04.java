package leeseolhui.baekjoon.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 55-50+40

        int a = str.indexOf('-');
        int b = str.indexOf('+');

        System.out.println(a + " " + b);
    }
}
