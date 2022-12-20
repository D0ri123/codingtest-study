package leeseolhui.programmers;

import java.util.Arrays;

//카펫
// brown과 yellow를 더하면 총 면적이 된다.
// 가로길이는 세로길이와 같거나 세로길이보다 길다
public class Problem4 {
    public static void main(String[] args) {
        Problem4 pro4 = new Problem4();
        System.out.println(Arrays.toString(pro4.solution(10,2)));
    }

    public int[] solution(int brown, int yellow){
        int totalArea =  brown + yellow;
        int init = 2;
        int width = totalArea, height = totalArea;
        int[] answers = new int[2];

        while(init <= Math.sqrt(totalArea)){
            if(totalArea % init == 0) {
                width = init;
                height = totalArea/init;
                int w = width - 1; int h = height - 1;
                if(brown == (w*2) + (h*2)) break;
            }
            init++;
        }

        if(width>=height){
            answers[0] = width;
            answers[1] = height;
        } else{
            answers[0] = height;
            answers[1] = width;
        }
        return answers;
    }
}
