package lecture.G07_Recursive_Tree_Graph;

//ㅇ
public class GMain201 {
    public void DFS(int n){
        if (n == 0){
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
    public void solution(int n){
        DFS(n);
    }

    public static void main(String[] args) {
        GMain201 T = new GMain201();
        T.solution(11);
    }
}
