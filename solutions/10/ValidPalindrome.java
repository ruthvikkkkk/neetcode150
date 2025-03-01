/** https://leetcode.com/problems/valid-palindrome/
 *  https://neetcode.io/problems/is-palindrome
 */

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isAlphaNum(s.charAt(i)))
                i++;

            while (j > i && !isAlphaNum(s.charAt(j))) 
                j--;

            if(s.charAt(i) != s.charAt(j)) 
                return false;

            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
