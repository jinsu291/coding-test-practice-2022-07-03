package lecture.B02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BMain102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
                System.out.print(" ");
            } else {
                if (arr[i] > arr[i - 1]) {
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }
            }
        }
    }
}
