package leeseolhui.greedy;

//회의실 배정

import java.util.*;

class Meeting{
    int start;
    int end;

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class Code06 {
    public static int n;
    public static ArrayList<Meeting> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Meeting(start, end));
        }

        Collections.sort(list, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end == o2.end)
                    return o1.start - o2.start;
                return o1.end - o2.end;
            }
        });

        System.out.println(solution());
    }

    public static int solution(){
        int cnt = 0;
        int endTime = 0;
        for(Meeting meeting : list){
            if(meeting.start >= endTime){
                cnt++;
                endTime = meeting.end;
            }
        }
        return cnt;
    }
}
