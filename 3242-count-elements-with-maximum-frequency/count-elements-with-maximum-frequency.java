class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        
        int maxFreq = 0;
        for (int c : count) {
            maxFreq = Math.max(maxFreq, c);
        }
        
        int result = 0;
        for (int c : count) {
            if (c == maxFreq) {
                result += c;
            }
        }
        
        return result;
    }
}