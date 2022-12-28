package leeseolhui.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    int come;
    int go;
    public Person(int come, int go){
        this.come = come;
        this.go = go;
    }
}

public class Code07 {
    public static Person[] arr;
    public static ArrayList<Person> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new Person[n];
        for(int i=0; i<n; i++){
            int come = sc.nextInt();
            int go = sc.nextInt();
            arr[i] = new Person(come, go);
        }

        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2){
                return o1.come - o2.come; 
            }
        };

        Arrays.sort(arr, comp);
        solution();
    }

    public static void solution(){
        int capacity = Integer.MIN_VALUE;
        int count = 0;
        for(int i=arr[0].come; i<=72; i++){
            for(int j=0; j<arr.length; j++){
                if(i==arr[j].come) count++;
                if(i==arr[j].go) count--;
            }
            capacity = Math.max(capacity, count);
        }
        System.out.println(capacity);
    }
}
