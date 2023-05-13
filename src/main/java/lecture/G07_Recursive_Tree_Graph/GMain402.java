package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GMain402 {
    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            if (n == 2) {
                return 1;
            } else {
                return DFS(n - 2) + DFS(n - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(DFS(i) + " ");
        }
    }
}
