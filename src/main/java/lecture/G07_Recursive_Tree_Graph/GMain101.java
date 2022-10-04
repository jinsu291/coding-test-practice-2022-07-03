package lecture.G07_Recursive_Tree_Graph;

public class GMain101 {
    public void DFS(int n){
        if (n == 0){
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
    public void solution(int n){
        DFS(n);
    }

    public static void main(String[] args) {
        GMain101 T = new GMain101();
        T.solution(3);
    }
}
