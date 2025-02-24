/** https://leetcode.com/problems/group-anagrams/
 *  https://neetcode.io/problems/anagram-groups
 */

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>(); 
        for (String s : strs) {

            int[] alphabetCounter = new int[26];
            for (char sChar : s.toCharArray()) {
                alphabetCounter[sChar - 'a']++;
            }
            String key = Arrays.toString(alphabetCounter);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s); 
        }
        return new ArrayList<>(result.values());
    }
}
