package leeseolhui.baekjoon.level05;

public class code02 {
    public static int self(int num){
        int sum = num;
        while(num != 0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        boolean[] arr = new boolean[10001];
        for(int i=1; i<arr.length; i++){
            int selfNum = self(i);
            if(self(i)<=10000){
                arr[selfNum] = true;
            }
        }

        for(int i=1; i<=10000; i++){
            if(arr[i] != true){
                System.out.println(i);
            }
        }

    }
}
