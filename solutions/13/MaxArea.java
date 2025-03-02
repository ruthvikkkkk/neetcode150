/** https://leetcode.com/problems/container-with-most-water/
 *  https://neetcode.io/problems/max-water-container
 */

class Solution {
    public int maxArea(int[] heights) {

        int product = Integer.MIN_VALUE;

        int i = 0;
        int j = heights.length - 1;

        while (j > i) {
            int temp = Math.min(heights[i], heights[j]) * (j - i);

            if (heights[j] >= heights[i])
                i++;
            else
                j--;

            if (temp > product)
                product = temp;
        }

        return product;
        
    }
}
