package lecture.C03_Two_pointers_Sliding_window;

import java.util.Scanner;

//ㅇㅇ
public class CMain601 {
    public int solution(int n, int k, int[] arr){
        int answer = 0, cnt = 0, lt =0;
        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0){
                cnt++;
            }
            while (cnt > k){
                if (arr[lt] == 0){
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        CMain601 T = new CMain601();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}