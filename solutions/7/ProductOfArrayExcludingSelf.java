/** https://leetcode.com/problems/product-of-array-except-self/
 *  https://neetcode.io/problems/products-of-array-discluding-self
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] prefixProducts = new int[nums.length];
        int[] suffixProducts = new int[nums.length];
        int p = 1;
        int s = 1;
        int len = nums.length-1;

        for (int i = 0, j = len; i <= len && j >= 0; i++, j--) {
            if (i >= 2) 
                p = prefixProducts[i - 1];
            
            if (i == 0) {
                prefixProducts[i] = 1;
            } else if (i == 1) {
                prefixProducts[i] = nums[0];
            } else { 
                prefixProducts[i] = nums[i-1] * p;
            }
            
            if (j <= len - 2)
                s = nums[j + 1];

            if (j == len) {
                suffixProducts[j] = 1;
            } else if (i == 1) {
                suffixProducts[j] = nums[len];
            } else {
                suffixProducts[j] = suffixProducts[j+1] * s;
            }
        }

        System.out.println(Arrays.toString(prefixProducts));
        System.out.println(Arrays.toString(suffixProducts));

        for (int i = 0; i < res.length; i++) 
            res[i] = prefixProducts[i] * suffixProducts[i];

        return res;
    }
}  
