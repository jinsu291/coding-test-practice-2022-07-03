package lecture.I09_Greedy;

import java.util.*;
class Time201 implements Comparable<Time201>{
    public int s, e;
    Time201(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time201 o){
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}

class IMain201 {
    public int solution(ArrayList<Time201> arr, int n){
        int cnt=0;
        Collections.sort(arr);
        int et=0;
        for(Time201 ob : arr){
            if(ob.s>=et){
                cnt++;
                et=ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        IMain201 T = new IMain201();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time201> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Time201(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}
