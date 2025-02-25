/** https://leetcode.com/problems/top-k-frequent-elements/
 *  https://neetcode.io/problems/top-k-elements-in-list
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max) 
                max = n;
            
            if (n < min)
                min = n;
        }
        int[] freq = new int[max - min + 1];

        for (int n : nums)
            freq[n - min]++;
            
        int index = 0;
        int[] res = new int[k];
        
    }
}