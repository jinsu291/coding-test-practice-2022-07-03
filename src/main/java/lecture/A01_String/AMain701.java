package lecture.A01_String;

import java.util.Scanner;

//o
public class AMain701 {
    public String solution(String str) {
        String answer ="YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0; i< len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AMain701 T = new AMain701();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
