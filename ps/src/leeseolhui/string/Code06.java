package leeseolhui.string;

// 가장 짧은 문자거리

import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        solution(word);
    }

    public static void solution(String word){
        String[] words = word.split(" ");
        String text = words[0];
        String character = words[1];

        int[] answer = new int[text.length()];

        int pointer = 1000;
        for(int i=0; i<text.length(); i++){
            if(String.valueOf(text.charAt(i)).equals(character)) {
                pointer = 0;
                answer[i] = 0;
            }
            else{
                pointer++;
                answer[i] = pointer;
            }
        }

        pointer = 1000;
        for(int i=text.length()-1; i>=0; i--){
            if(String.valueOf(text.charAt(i)).equals(character))
                pointer = 0;
            else{
                pointer++;
                answer[i] = Math.min(answer[i], pointer);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a : answer){
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
