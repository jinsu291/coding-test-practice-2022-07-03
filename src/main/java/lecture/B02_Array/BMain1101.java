package lecture.B02_Array;

import java.util.Scanner;

// 어려움 다시보기!!
public class BMain1101 {
    public int solution(int n, int[][] arr){
        int answer = 0, max = 0;
        for (int i = 1; i <=n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= 5; k++){
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BMain1101 T = new BMain1101();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
