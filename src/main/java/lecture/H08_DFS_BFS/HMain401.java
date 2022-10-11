package lecture.H08_DFS_BFS;

import java.util.*;
class HMain401{
    static int[] pm;
    static int n, m;
    public void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=1; i<=n; i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args){
        HMain401 T = new HMain401();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
}