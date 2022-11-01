package lecture.G07_Recursive_Tree_Graph;

import java.util.Scanner;

//ㅇ
public class GMain101 {
    private int DFS(int n) {
        if (n == 0) {
            return 1;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
        return (n + 1);
    }

    public static void main(String[] args) {
        GMain101 T = new GMain101();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.DFS(n - 1));
    }
}
