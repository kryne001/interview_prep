public class App {
    public boolean canConstruct(String ransomNote, String magazine) {
        int charAr[] = new int[26]; // contraints are only lower case letters so only need size of 26

        for (int i = 0; i < magazine.length(); i++) // loop keeps track of all instances of each letter in magazine
        {
            charAr[magazine.charAt(i) - 'a']++;
        }

        // go through ransomNote
        // every letter scene, decrement charAr at letter position
        // if charAr ever goes negative, that means we pulled from a letter that wasn't available, so magazine
        // does not have enough letters. return false
        for (int i = 0; i < ransomNote.length(); i++)
        {
            charAr[ransomNote.charAt(i) - 'a']--;
            if (charAr[ransomNote.charAt(i) - 'a'] < 0)
            {
                return false;
            }
        }

        return true; // if we go through loop and find nothing wrong return true
    }
    
    public static void main(String[] args) throws Exception {
        String ransom = "aa";
        String mag = "ab";
        App myApp = new App();

        if (!myApp.canConstruct(ransom, mag))
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }


    }
}
