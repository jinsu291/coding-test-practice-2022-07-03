package lecture.I09_Greedy;

import java.util.*;
class Time301 implements Comparable<Time301>{
    public int time;
    public char state;
    Time301(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time301 ob){
        if(this.time==ob.time) return this.state-ob.state;
        else return this.time-ob.time;
    }
}

class IMain301 {
    public int solution(ArrayList<Time301> arr){
        int answer=Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt=0;
        for(Time301 ob : arr){
            if(ob.state=='s') cnt++;
            else cnt--;
            answer=Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args){
        IMain301 T = new IMain301();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time301> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT=kb.nextInt();
            int eT=kb.nextInt();
            arr.add(new Time301(sT, 's'));
            arr.add(new Time301(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}