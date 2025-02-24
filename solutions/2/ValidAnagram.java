/** https://leetcode.com/problems/valid-anagram/
 *  https://neetcode.io/problems/is-anagram
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int[] alphabetCounter = new int[26];

        for (char c : s.toCharArray())
            alphabetCounter[c - 'a']++;

        for (char c : t.toCharArray())
            alphabetCounter[c - 'a']--;
        
        for (int i = 0; i < 26; i++)
            if (alphabetCounter[i] != 0)
                return false;

        return true;
    }
}
