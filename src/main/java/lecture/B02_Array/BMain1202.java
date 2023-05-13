package lecture.B02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BMain1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) {
                            pi = l;
                        }
                        if (arr[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
