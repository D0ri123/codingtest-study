package leeseolhui.samsung;

//바람의 신 - 70점

import java.util.Arrays;
import java.util.Scanner;

public class Problem02 {
    public static int n,m,k;
    public static int[][] area;
    public static int[] dir = {1,2,3,4}; //1=상, 2=하, 3=좌, 4=우
    public static int[] arr;
    public static int max;

    public static void main(String[] args){ //입력을 받는 곳
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1; i<=t; i++){
            n = sc.nextInt(); //행의 크기
            m = sc.nextInt(); //열의 크기
            k = sc.nextInt(); //바람 종류의 수

            area = new int[n][m]; //입력받은 n,m으로 2차원 배열 생성
            max = Integer.MIN_VALUE;
            arr = new int[k+1];

            for(int low=0; low<n; low++){ //구역에 있는 사람수를 입력받기
                for(int column=0; column<m; column++){
                    area[low][column] = sc.nextInt();
                }
            }
            settings(0);
            System.out.printf("#%d %d", i, max);
            System.out.println();
        }
    }

    //k개의 방향 경우의 수를 설정하기(중복순열로 만들어야 함)
    public static void settings(int L){
        if(L==k){
            max = Math.max(max, getMax(arr));
        }else{
            for(int i=0; i<4; i++){
                arr[L] = dir[i];
                settings(L+1);
            }
        }
    }

    //주어진 방향대로 움직여서 최대 인구수 찾기
    public static int getMax(int[] arr){
        int[][] copied = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                copied[i][j] = area[i][j];
            }
        }

        for(int i=0; i<k; i++){
            if(arr[i]==1) {//하(북->남)
                for (int j=n-2; j>=0; j--) {
                    for (int l=0; l<m; l++) {
                        copied[j+1][l] += copied[j][l];
                        copied[j][l] = 0;
                    }
                }
            }

            if(arr[i]==2) {//상(남->북)
                for (int j=1; j<=n-1; j++) {
                    for (int l=0; l<m; l++) {
                        copied[j-1][l] += copied[j][l];
                        copied[j][l] = 0;
                    }
                }
            }

            if(arr[i]==3) {//좌(서->동)
                for (int j=m-2; j>=0; j--) {
                    for (int l=0; l<n; l++) {
                        copied[l][j+1] += copied[l][j];
                        copied[l][j] = 0;
                    }
                }
            }

            if(arr[i]==4) {//우(동->서)
                for (int j=1; j<=m-1; j++) {
                    for (int l=0; l<n; l++) {
                        copied[l][j-1] += copied[l][j];
                        copied[l][j] = 0;
                    }
                }
            }
        }

        int population = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            population = Math.max(population, Arrays.stream(copied[i]).max().getAsInt());
        }
        return population;
    }
}
