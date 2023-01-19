import java.util.*;

public class App {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        App myApp = new App();
        List<String> answer = myApp.generateParenthesis(3);
        
        for (String s : answer)
        {
            System.out.print("[");
            for (char c : s.toCharArray()) System.out.print(c);
            System.out.print("],");
        }
    }
}
