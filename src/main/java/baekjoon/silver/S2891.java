package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//ㅇ
public class S2891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken()) - 1;
            arr[num] = arr[num] - 1;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            int num = Integer.parseInt(st.nextToken()) - 1;
            arr[num] = arr[num] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == 2 && arr[1] == 0) {
                arr[0] = 1;
                arr[1] = 1;
            } else if (i == arr.length - 1) {
                if (arr[arr.length - 1] == 2 && arr[arr.length - 2] == 0) {
                    arr[arr.length - 1] = 1;
                    arr[arr.length - 2] = 1;
                }
            } else {
                if (arr[i] == 2) {
                    if (arr[i - 1] == 0) {
                        arr[i] = 1;
                        arr[i - 1] = 1;
                    } else if (arr[i + 1] == 0) {
                        arr[i] = 1;
                        arr[i + 1] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
            }
        }
        System.out.println(cnt++);
    }
}