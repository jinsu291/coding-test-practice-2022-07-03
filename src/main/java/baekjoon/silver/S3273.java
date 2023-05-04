package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//ㅇ
public class S3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.parallelSort(arr);
        int k = Integer.parseInt(br.readLine());
        int count = 0;
        int start = 0;
        int end = n - 1;
        int sum = 0;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == k) {
                count++;
            }
            if (sum <= k) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}
