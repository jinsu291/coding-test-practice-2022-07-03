package lecture.D04_HashMap_HashSet_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DMain402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int result = 0;
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = str2.length() - 1; rt < str1.length(); rt++) {
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);
            if (map1.equals(map2)) {
                result++;
            }
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if (map1.get(str1.charAt(lt)) == 0) {
                map1.remove(str1.charAt(lt));
            }
            lt++;
        }
        System.out.println(result);
    }
}
