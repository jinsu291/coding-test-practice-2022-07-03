package lecture.A01_String;

import java.util.Scanner;

// 다시보기!!
public class AMain601 {
    public String solution(String str) {
        String answer ="";
        for(int i = 0; i < str.length(); i++ ){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AMain601 T = new AMain601();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
