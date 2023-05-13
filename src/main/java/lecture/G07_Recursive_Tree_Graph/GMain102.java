package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GMain102 {
    private static int DFS(int n) {
        if (n == 0) {
            return 1;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
        return (n + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(DFS(n - 1));
    }
}
