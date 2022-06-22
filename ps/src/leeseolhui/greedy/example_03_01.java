package leeseolhui.greedy;

public class example_03_01 {
    public static void main(String[] args){
        int change = 1260;

        int a = change / 500; //a는 500원
        change = change - (500*a);

        int b = change / 100; //b는 100원
        change = change - (100*b);

        int c = change / 50; //c는 50원
        change = change - (50*c);

        int d = change / 10; //d는 10원
        change = change - (10*d);

        System.out.println(a+b+c+d);
    }
}
