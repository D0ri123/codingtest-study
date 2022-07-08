package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code10 {
    static boolean check(String s){
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        String str = s;

        for(int i=0; i<s.length(); i++){
            int now = str.charAt(i);
            if(prev != now){
                if(alphabet[now - 97] == false){
                    alphabet[now - 97] = true;
                    prev = now;
                }
                else
                    return false;
            } else{
                continue;
              }
            }
        return true;
        }
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             sc.nextLine();
             int count = 0;

             for(int i=0; i<n; i++){
                   String s = sc.nextLine();
                   if(check(s) == true)
                       count++;
             }

            System.out.println(count);
        }

    }


