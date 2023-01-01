package leeseolhui.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient{
    int order;
    int emergency;
    public Patient(int order, int emergency){
        this.order = order;
        this.emergency = emergency;
    }
}

public class Code08 {
    public static void main(String[] args){
        Queue<Patient> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 1;

        for(int i=0; i<n; i++){
            int emergency = sc.nextInt();
            q.offer(new Patient(i, emergency));
        }

        while(!q.isEmpty()){
            Patient patient = q.poll();
            for(Patient person : q){
                if(person.emergency > patient.emergency){
                    q.offer(patient);
                    patient = null;
                    break;
                }
            }
            if(patient != null){
                if(patient.order!=m) answer++;
                else break;
            }
        }
        System.out.println(answer);
    }
}
