/** https://leetcode.com/problems/encode-and-decode-strings/
 *  https://neetcode.io/problems/string-encode-and-decode
 */

class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) 
            res.append(str.length()).append('#').append(str);
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if (str == null || str.equals("")) {
            return res;
        }

        int i = 0;
        int j = Integer.parseInt(str.charAt(i)+"") + 2;

        while (j <= str.length()) {
            String substring = str.substring(i+2, j);
            res.add(substring);
            if (j < str.length()) {
                i += substring.length() + 2;
                j = i + Integer.parseInt(str.charAt(i)+"") + 2;
            } else if (j == str.length()) {
                break;
            }
        }
        return res;
    }
}
