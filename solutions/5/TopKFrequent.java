/** https://leetcode.com/problems/top-k-frequent-elements/
 *  https://neetcode.io/problems/top-k-elements-in-list
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] frequencyBuckets = new List[nums.length + 1];

        for (int i = 0; i < frequencyBuckets.length; i++)
            frequencyBuckets[i] = new ArrayList<>();

        for (int n : nums) 
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
            frequencyBuckets[entry.getValue()].add(entry.getKey());

        int index = 0;

        for (int j = frequencyBuckets.length -1; j > 0 && index < k; j--) {
            for (int n : frequencyBuckets[j]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}