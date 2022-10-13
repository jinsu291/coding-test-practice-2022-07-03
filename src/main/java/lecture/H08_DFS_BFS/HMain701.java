package lecture.H08_DFS_BFS;

import java.util.*;
class HMain701{
    int[][] dy=new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
    }
    public static void main(String[] args){
        HMain701 T = new HMain701();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        System.out.println(T.DFS(n, r));
    }
}