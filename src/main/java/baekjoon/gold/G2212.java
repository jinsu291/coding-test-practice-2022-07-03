package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());

            if (k > n) {
                System.out.println(0);
                return;
            }
        }
        Arrays.sort(p);
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = p[i + 1] - p[i];
        }
        Arrays.sort(diff);
        int sum = 0;
        for (int i = 0; i < diff.length - k + 1; i++) {
            sum += diff[i];
        }
        System.out.println(sum);
    }
}
