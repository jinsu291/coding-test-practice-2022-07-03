package lecture.F06_Sorting_and_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FMain502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        char result = 'U';
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = 'D';
            }
        }
        System.out.println(result);
    }
}
