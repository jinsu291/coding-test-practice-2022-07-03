package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            if (n == 0 && m == 0) {
                break;
            } else {
                for (int i = 0; i < n; i++) {
                    arr1[i] = Integer.parseInt(br.readLine());
                }
                for (int i = 0; i < m; i++) {
                    arr2[i] = Integer.parseInt(br.readLine());
                }
                int answer = 0;
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                int p1 = 0, p2 = 0;
                while (p1 < n && p2 < m) {
                    if (arr1[p1] == arr2[p2]) {
                        answer++;
                        p1++;
                        p2++;
                    } else if (arr1[p1] < arr2[p2]) p1++;
                    else p2++;
                }
                System.out.println(answer);
            }
        }
    }
}
