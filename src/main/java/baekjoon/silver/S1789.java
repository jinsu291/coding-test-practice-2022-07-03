package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ㅇ
public class S1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        int i = 0;
        long sum = 0;
        while (sum < s) {
            i++;
            sum += i;
        }
        if (sum > s) {
            System.out.println(i - 1);
        } else {
            System.out.println(i);
        }
    }
}