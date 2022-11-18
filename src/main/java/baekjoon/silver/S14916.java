package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        while (n % 5 != 0) {
            n -= 2;
            cnt++;
            if (n < 0) {
                cnt = -1;
                break;
            }
        }
        if (cnt > -1) {
            cnt += n / 5;
        }
        System.out.println(cnt);
    }
}
