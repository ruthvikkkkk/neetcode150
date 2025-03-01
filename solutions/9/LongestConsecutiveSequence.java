/** https://leetcode.com/problems/longest-consecutive-sequence/
 *  https://neetcode.io/problems/longest-consecutive-sequence
 */

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            } else if (nums[i] == nums[i+1] - 1) { 
                current++;
            } else {
                if(current > longest) 
                    longest = current;
                current = 1;
            }
        }

        return Math.max(longest, current);
    }
}