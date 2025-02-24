/** https://leetcode.com/problems/two-sum/
 *  https://neetcode.io/problems/two-integer-sum
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (intMap.containsKey(difference)) {
                return new int[]{intMap.get(difference), i};
            }

            intMap.put(num, i);
        }

        return new int[0];
    }
}
