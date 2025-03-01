/** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *  https://neetcode.io/problems/two-integer-sum-ii
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int sum = numbers[i] + numbers[j];
        if (sum == target)
            return new int[]{i+1, j+1};

        while (sum != target && j > i) {
            sum = numbers[i] + numbers[j];

            if (sum > target) 
                j--;
            
            if (sum < target)
                i++;

            if (sum == target)
                return new int[]{i+1, j+1};
        }
        return new int[]{-1, -1};
    }
}
