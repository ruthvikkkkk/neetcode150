/** https://leetcode.com/problems/trapping-rain-water/
 *  https://neetcode.io/problems/max-water-container
 */

class Solution {
    public int trap(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }

        int totalWater = 0, i = 0, j = height.length -1;
        int lMax = height[i];
        int rMax = height[j];

        while (i < j) {
            if (lMax < rMax) {
                i++;
                lMax = Math.max(lMax, height[i]);
                totalWater += lMax - height[i];
            } else {
                j--;
                rMax = Math.max(rMax, height[j]);
                totalWater += rMax - height[j];
            }
        }
        return totalWater;
    }
}
