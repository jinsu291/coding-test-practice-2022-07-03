package lecture.A01_String;

import java.util.Scanner;

//o
public class AMain902 {
    public int solution(String s) {
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x >= 48 && x <= 57){
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AMain902 T = new AMain902();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
