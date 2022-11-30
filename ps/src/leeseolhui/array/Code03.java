package leeseolhui.array;

//가위 바위 보

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String eventOfA = sc.nextLine();
        String eventOfB = sc.nextLine();

        String[] A = eventOfA.split(" ");
        String[] B = eventOfB.split(" ");

        solution(n, A, B);
    }

    public static void solution(int n, String[] player1, String[] player2){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int eventCaseA = Integer.parseInt(player1[i]);
            int eventCaseB = Integer.parseInt(player2[i]);
            if(inspector(eventCaseA, eventCaseB) == eventCaseA)
                sb.append("A").append("\n");
            else if(inspector(eventCaseA, eventCaseB) == eventCaseB)
                sb.append("B").append("\n");
            else
                sb.append("D").append("\n");
        }
        System.out.println(sb);
    }

    public static int inspector(int event1, int event2){
        if(Math.abs(event1-event2)==2)
            if(event1==1)
                return event1;
            else
                return event2;

        if(event1>event2)
            return event1;
        else if(event1<event2)
            return event2;
        else
            return 0;
    }
}
