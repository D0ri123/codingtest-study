package leeseolhui.greedy;

//씨름 선수

import java.util.*;

class Participant{
    int weight;
    int height;

    public Participant(int height, int weight){
        this.height = height;
        this.weight = weight;
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

        System.out.println(solution());
    }

    public static int solution(){
        boolean flag = false;
        int remove = 0;
        for(int i=0; i<list.size(); i++){
            Participant comp = list.get(i);
            for(int j=0; j<list.size(); j++){
                if(i==j) continue;
                if((comp.weight < list.get(j).weight) && (comp.height < list.get(j).height)) flag = true;
            }
            if(flag) {
                remove++;
                flag = false;
            }
        }

        return list.size() - remove;
    }
}
