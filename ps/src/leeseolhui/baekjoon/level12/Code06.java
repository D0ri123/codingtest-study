package leeseolhui.baekjoon.level12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 집합 A의 원소개수
        int b = sc.nextInt(); // 집합 B의 원소개수

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int i=0; i<a; i++){ //집합 A에 원소를 넣는 단계
            A.add(sc.nextInt());
        }

        for(int i=0; i<b; i++){ //집합 B에 원소를 넣는 단계
            B.add(sc.nextInt());
        }

        Iterator it1 = A.iterator();
        while(it1.hasNext()){
            Object obj1 = it1.next();
            if(!B.contains(obj1))
                result.add((Integer) obj1);
        }

        Iterator it2 = B.iterator();
        while(it2.hasNext()){
            Object obj2 = it2.next();
            if(!A.contains(obj2))
                result.add((Integer)obj2);
        }
        System.out.println(result.size());
    }
}
