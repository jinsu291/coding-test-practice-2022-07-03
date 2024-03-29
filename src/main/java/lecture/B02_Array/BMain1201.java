package lecture.B02_Array;

import java.util.Scanner;

//★★
//ㅇㅇ
public class BMain1201 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { // i, j 는 학생번호
            for (int j = 1; j <= m; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) { // 테스트 수
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) { // s는 등수
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BMain1201 T = new BMain1201();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
