package leeseolhui.programmers;

import java.util.ArrayList;

public class Problem1 {
    public int solution(int[] queue1, int[] queue2) {
        int answer=0;
        long sum_q1=0, sum_q2=0;
        long goal=0;
        ArrayList<Long> q1 = new ArrayList<>();
        ArrayList<Long> q2 = new ArrayList<>();

        for(long a:queue1){
            sum_q1+=a;
            q1.add(a);
        }

        for(long b:queue2){
            sum_q2+=b;
            q2.add(b);
        }

        goal = (sum_q1+sum_q2)/2; //q1과 q2 합의 절반

        int lt_q1=0, lt_q2=0;
        while(sum_q1 != goal){ //q1의 총 합만 goal과 비교하여 같으면 됨.
            if(answer > q1.size()+q2.size()) return -1;
            //q1과 q2의 전체 사이즈만큼 돌아도 answer가 나오지 않으면 -1을 리턴한다.
            if(sum_q1<goal){ //goal보다 작으면 q2가 q1에게 숫자를 준다.
                long num1 = q2.get(lt_q2);
                sum_q1 += num1;
                q1.add(num1);
                sum_q2 -= num1;
                q2.remove(lt_q2);
                answer++; // pop과 insert가 끝난 후 카운트한다.
            }else{ //goal보다 크면 q1은 q2에게 숫자를 준다.
                long num2 = q1.get(lt_q1);
                sum_q1 -= num2;
                q1.remove(lt_q1);
                sum_q2 += num2;
                q2.add(num2);
                answer++;
            }
        }
        return answer;
    }
}
