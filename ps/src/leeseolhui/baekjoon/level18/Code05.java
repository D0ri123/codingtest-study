package leeseolhui.baekjoon.level18;

import java.util.Arrays;
import java.util.Scanner;

public class Code05 {
    public static int findSmallest(int[] arr, int from, int to){ //인덱스가 0보다 큰 원소들 중에서 가격이 index[0]보다 젤 작은 인덱스값을 찾기
        int min = arr[from];
        for(int i=from+1; i<to; i++){
            if(arr[i]<min)
                min = arr[i];
            return i;
        }
        return from;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int[] dis = new int[city-1];
        int[] price = new int[city];
        int min = 0;

        for(int i=0; i<dis.length; i++){
            dis[i] = sc.nextInt();
        }
        for(int i=0; i<price.length; i++){
            price[i] = sc.nextInt();
        }

        int[] price1 = Arrays.copyOfRange(price, 0, dis.length);

        min += dis[0] * price1[0];
        int index1 = findSmallest(price1, 0, price1.length); //index가 0보다 큰 원소들 중에서 price1[0]보다 더 작은 원소의 인덱스 숫자
        int index2 = findSmallest(price1, 0, index1);
        if(index1 > 0){
            if(index2<index1) {
                for(int i=1; i<=index2; i++) min += dis[i]*price1[index2];
                for(int i=index2+1; i<dis.length; i++) min+=dis[i] * price1[index1];
            }
            else{
                for(int i=1; i<dis.length; i++) min+=dis[i]*price1[index1];
            }
        }

//        for(int i=1; i<dis.length; i++){
//            if(price1[i-1] >= price1[i])
//                min += dis[i] * price1[i];
//            else
//                min += dis[i] * price1[i-1];
//        }
        System.out.println(min);
    }
}
