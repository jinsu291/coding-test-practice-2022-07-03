package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S19947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[n + 1];

        arr[0] = k;

        for (int i = 1; i <= n; i++) {
            arr[i] = (long) Math.floor(arr[i - 1] * 1.05);
            if(i >= 3)
                arr[i] = Math.max((long)Math.floor(arr[i-3] * 1.2), arr[i]);
            if(i >= 5)
                arr[i] = Math.max((long)Math.floor(arr[i-5] * 1.35), arr[i]);
        }
        System.out.println(arr[n]);
    }
}
