package baekjoon.silver;

import java.util.Scanner;

public class S11660 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x1, x2, y1, y2 =0;
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] arr = new int[n + 1][n + 1];
        int[][] arr1 = new int[n + 1][n + 1];
        int[] sum = new int[m];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr1[i][j] = arr1[i - 1][j] + arr1[i][j - 1] - arr1[i - 1][j - 1] + arr[i][j];
            }
        }

        for(int k = 0; k < m; k++) {
            x1 = kb.nextInt();
            y1 = kb.nextInt();
            x2 = kb.nextInt();
            y2 = kb.nextInt();
            sum[k] += arr1[x2][y2] - arr1[x2][y1 - 1] - arr1[x1 - 1][y2] + arr1[x1 - 1][y1 - 1];

        }
        for(int k = 0; k < m; k++) {
            System.out.println(sum[k]);
        }
    }
}
