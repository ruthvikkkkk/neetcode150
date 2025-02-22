/** https://leetcode.com/problems/contains-duplicate/
 *  https://neetcode.io/problems/duplicate-integer
 */

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i : nums) {
            if (numSet.contains(i)) {
                return true;
            }
            numSet.add(i);
        }
        return false;
    }
}
