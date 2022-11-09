package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class S7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hm = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        while (n-- > 0) {
            String[] member = br.readLine().split(" ");
            hm.put(member[0], member[1]);
        }
        for (String key : hm.keySet()) {
            if (hm.get(key).equals("enter")) {
                arr.add(key);
            }
        }
        Collections.sort(arr);

        for (int i = arr.size() - 1; i >= 0 ; i--) {
            System.out.println(arr.get(i));
        }
    }
}
