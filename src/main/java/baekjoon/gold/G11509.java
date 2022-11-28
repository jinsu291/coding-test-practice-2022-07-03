package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G11509 {
    static int[] arrowHeight = new int[1000002];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0, height  = 0;
        for (int i = 0; i < n; i++) {
            height  = arr[i];
            if (arrowHeight[height + 1] == 0) {
                arrowHeight[height]++;
                cnt++;
            } else {
                arrowHeight[height + 1]--;
                arrowHeight[height]++;
            }
        }
        System.out.println(cnt);
    }
}
