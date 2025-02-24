/** https://leetcode.com/problems/contains-duplicate/
 *  https://neetcode.io/problems/duplicate-integer
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i : nums) {
            if (!numSet.add(i)) 
                return true;
            
        }
        return false;
    }
}
