package baekjoon.silver;

import java.io.*;
import java.math.BigInteger;

public class S10826 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        BigInteger[] arr = new BigInteger[n + 2];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
        }

        bw.write(String.valueOf(arr[n]));
        bw.flush();
        br.close();
        bw.close();
    }
}
