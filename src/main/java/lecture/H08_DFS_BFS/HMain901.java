package lecture.H08_DFS_BFS;

import java.util.Scanner;
//★★
//ㅇ
class HMain901{
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s){
        if (L == m) {
            for (int x : combi) {
                System.out.print(x + " ");
                System.out.println();
            }
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args){
        HMain901 T = new HMain901();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}