package lecture.B02_Array;

import java.util.ArrayList;
import java.util.Scanner;

// 어려움 다시보기!!
public class BMain701 {
    public int solution(int n, int[] arr){
        int answer = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        BMain701 T = new BMain701();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
