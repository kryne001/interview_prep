import java.util.Scanner;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int sArray[] = new int[26];
        int tArray[] = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            if (s.length() != t.length())
            {
                return false;
            }

            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;

        }

        for (int i = 0; i < sArray.length; i++)
        {
            if (sArray[i] != tArray[i])
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        Solution mySolution = new Solution();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s = myScanner.nextLine();

        System.out.println("Enter string 2: ");
        String t = myScanner.nextLine();

        myScanner.close();

        if (!mySolution.isAnagram(s,t))
        {
            System.out.println("false");
        }
        else 
        {
            System.out.println("true");
        }
    }
}
