class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftPr = 1;
        int rightPr = 1;
        int[] ans = new int[n];
        for( int i = n-1; i>=0;i--){
            ans[i] = rightPr;
            rightPr = rightPr * nums[i];
        }
        for(int i = 0; i<n; i++){
            ans[i] = ans[i] * leftPr;
            leftPr = leftPr * nums[i]; 
        }
        return ans;
    }
}