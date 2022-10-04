package lecture.G07_Recursive_Tree_Graph;

public class GMain401 {
    public int DFS(int n){
        if (n == 1){
            return 1;
        } if (n == 2){
            return 1;
        } else {
            return DFS(n -2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        GMain401 T = new GMain401();
        int n = 10;
        for (int i = 1; i <= n; i++){
            System.out.println(T.DFS(i) + " ");
        }
    }
}
