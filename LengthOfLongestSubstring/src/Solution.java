import java.util.Scanner;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0; int end = 0; int curSize = 0; int maxSize = 0;
        int charMap[] = new int[128];

        if (s.length() == 0)
        {
            return 0;
        }

        while (end < s.length())
        {
            charMap[s.charAt(end)]++;
            curSize++;
            while((charMap[s.charAt(end)]) <= 1)
            {
                if(start == end)
                {
                    end++;
                    continue;
                }
                charMap[s.charAt(end)]++;
                while ((charMap[s.charAt(end)]) > 1)
                {
                    charMap[s.charAt(start)]--;
                    start++;
                    maxSize = Math.max(curSize, maxSize);
                    curSize--;
                }
                end++;
                curSize++;
                if (end == s.length())
                {
                    maxSize = Math.max(curSize, maxSize);
                    break;
                }
            }
        }
        return maxSize;
    }


public static void main(String args[])
{
    Solution mySolution = new Solution();
    Scanner myScanner = new Scanner(System.in);
    String s;

    System.out.println("Enter the string: ");
    s = myScanner.nextLine();
    myScanner.close();

    int answer = mySolution.lengthOfLongestSubstring(s);
    System.out.println("Length is: " + answer);
    

}}
