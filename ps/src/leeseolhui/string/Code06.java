package leeseolhui.string;

// 가장 짧은 문자거리

import java.util.ArrayList;
import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        solution(word);
    }

    public static void solution(String word){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        String[] words = word.split(" ");
        String text = words[0];
        String character = words[1];

        list = collectTargetIdx(list, text, character);

        for(int i=0; i<text.length(); i++){
            int min = Integer.MAX_VALUE;
            if(!String.valueOf(text.charAt(i)).equals(character)) {
                for (int num : list) {
                    min = Math.min(Math.abs(i - num), min);
                }
                sb.append(min).append(" ");
            }
            else
                sb.append(0).append(" ");
        }
        System.out.println(sb);
    }

    public static ArrayList<Integer> collectTargetIdx(ArrayList<Integer> list, String text, String target){
        for(int i=0; i<text.length(); i++){
            if(String.valueOf(text.charAt(i)).equals(target))
                list.add(i);
        }
        return list;
    }
}
