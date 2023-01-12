public class Solution {

    class Solution {
        public boolean isPalindrome(String s) {
            int start = 0; int end = s.length() - 1;
            String updated = "";
    
            for (int i = 0; i < s.length(); i++)
            {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                {
                    updated += s.charAt(i);
                }
            }
    
            updated = updated.toLowerCase();
    
            for (start = 0, end = updated.length() - 1; start <= end; start++, end--)
            {
                if (updated.charAt(start) != updated.charAt(end))
                {
                    return false;
                }
            }
    
            return true;
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
