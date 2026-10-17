class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for( int num : nums){
            if(num % 2 == 0){
                ans[i] = num;
                i++;
            }
        }
        for( int num : nums){
        if(num % 2 != 0){
        ans[i] = num;
        i++;
    }
    }
    return ans;
}
}