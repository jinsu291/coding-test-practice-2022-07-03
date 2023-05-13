package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GMain602 {
    private static int n;
    private static int[] arr;

    private static void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            arr[L] = 1;
            DFS(L + 1);
            arr[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        DFS(1);
    }
}
