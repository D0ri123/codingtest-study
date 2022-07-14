package leeseolhui.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Example_06_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new); //wrapper 클래스로 박싱해줘야 한다.
        Arrays.sort(tmp, Comparator.reverseOrder());
        System.out.println(Arrays.toString(tmp));
    }
}
