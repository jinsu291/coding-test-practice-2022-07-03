package lecture.B02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BMain302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                System.out.println("D");
            } else if (a[i] == 1 & b[i] == 3) {
                System.out.println("A");
            } else if (a[i] == 2 && b[i] == 1) {
                System.out.println("A");
            } else if (a[i] == 3 && b[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
