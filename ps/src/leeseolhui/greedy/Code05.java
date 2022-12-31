package leeseolhui.greedy;

//씨름 선수

import java.util.*;

class Participant implements Comparable<Participant>{
    int weight;
    int height;

    public Participant(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Participant o){
        return o.height - this.height;
    }
}

public class Code05 {
    public static ArrayList<Participant> list;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Participant(height, weight));
        }

        Collections.sort(list);

        System.out.println(solution());
    }

    public static int solution(){
        int max = list.get(0).weight;
        int remove = 0;
        for(int i=1; i<list.size(); i++){
            if(max > list.get(i).weight) remove++;
            else max = list.get(i).weight;
        }
        return list.size() - remove;
    }
}
