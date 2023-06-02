package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GMain103 {
    private static void DFS(int n) {
        if (n == 0) {
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DFS(n);
    }
}
