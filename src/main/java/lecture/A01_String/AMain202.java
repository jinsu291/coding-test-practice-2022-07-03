package lecture.A01_String;

import java.util.Scanner;

public class AMain202 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x>=97 && x<=122){
                answer += (char)(x-32);
            }
            else answer += (char)(x+32);
        }
        return answer;
    }


    public static void main(String[] args) {
        AMain202 T = new AMain202();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
