import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        // map stores → (prefixSum → how many times it occurred)
        HashMap<Integer, Integer> map = new HashMap<>();

        // prefixSum of 0 occurs once (empty subarray / before array starts)
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            // add current element to running sum
            currentSum += num;

            // check if (currentSum - k) exists in map
            // if yes → there is a subarray ending here with sum = k
            int needed = currentSum - k;

            if (map.containsKey(needed)) {
                count += map.get(needed);   // add how many times it occurred
            }

            // add currentSum to map
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}