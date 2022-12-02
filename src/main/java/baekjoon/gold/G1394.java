package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class G1394 {
    private static Code[] codes;
    static final int MOD = 900528;

    private static class Code implements Comparable<Code> {
        String str;
        int idx;

        public Code(String str, int idx) {
            this.str = str;
            this.idx = idx;
        }

        @Override
        public int compareTo(Code o) {
            if (!this.str.equals(o.str)) {
                return this.str.compareTo(o.str);
            }
            return this.idx - o.idx;
        }

        @Override
        public boolean equals(Object object){
            Code code = (Code)object;
            if(this.str.equals(code.str)) return true;
            return false;
        }
    }

    private static int findStr(String str){
        int L = 0, R = codes.length - 1, pos = R;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (str.compareTo(codes[mid].str) < 0) {
                R = R - 1;
                pos = R;
            } else {
                L = L + 1;
            }
        }
        return codes[pos].idx;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("");
        codes = new Code[line.length];
        for (int i = 0; i < line.length; i++) {
            codes[i] = new Code(line[i], i + 1);
        }
        Arrays.sort(codes);
        String computerCode = br.readLine();

        long answer = 0;
        for (int i = 0; i < computerCode.length(); i++) {
            answer = (answer * codes.length + findStr(computerCode.substring(i, i + 1))) % MOD;
        }
        System.out.println(answer % MOD);
    }
}
