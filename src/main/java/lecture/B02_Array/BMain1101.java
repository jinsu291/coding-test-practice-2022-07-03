package lecture.B02_Array;

import java.util.Scanner;
//★
//ㅇ
public class BMain1101 {
    public int solution(int n, int[][] arr){
        int answer = 0, max = 0;
        for (int i = 1; i <=n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++){
                // j는 i말고 다른 사람 그런데 같이 넣어도 상관없음 어짜피 수가 아니고 가장작은 번호 출력이라서
                for (int k = 1; k <= 5; k++){  // k는 학년
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break; // break: 해야 답이 나온다.
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
        for (int i = 1; i <= n; i++) { // i는 학생
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
