// import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class App {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
    
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        String[] case1 = new String[6];
        case1[0] = "eatee";
        case1[1] = "tea";
        case1[2] = "tan";
        case1[3] = "ate";
        case1[4] = "nat"; 
        case1[5] = "bat"; 

        List<List<String>> solution = myApp.groupAnagrams(case1);
    }

}
