package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GMain203 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DFS(n);
    }

    private static void DFS(int n) {
        if (n != 0) {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
}

