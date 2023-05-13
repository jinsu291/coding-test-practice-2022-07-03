package lecture.G07_Recursive_Tree_Graph;

//ㅇ
public class GMain301 {
    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        GMain301 T = new GMain301();
        System.out.println(T.DFS(5));
    }
}
