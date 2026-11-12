class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int des = 1;
        int ans = 1;
        for(int i =1 ; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                inc++;
                des = 1;
            }
            else if( nums[i] < nums[i-1]){
                des++;
                  inc = 1;
            }
            else{
               inc = 1;
               des =1; 
            }
            ans = Math.max(ans,Math.max(inc,des));
        }
        return ans;
    }
}