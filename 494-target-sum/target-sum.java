class Solution {
    static int solve(int[] nums ,int target,int index,int sum){
        if(index == nums.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
            //plus
            int plus = solve(nums,target,index+1,sum + nums[index]);
            // sub
            int min = solve(nums,target,index+1,sum - nums[index]);
  
           return plus + min;
    }
    public int findTargetSumWays(int[] nums, int target) {
       int index = 0;
       int sum = 0;
       int ans = solve(nums,target,index,sum); 
       return ans;
    }
}