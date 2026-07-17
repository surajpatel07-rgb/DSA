class Solution {
    public int missingNumber(int[] nums) {
        int sumXor = 0;
        for (int num : nums){
            sumXor = sumXor ^ num;
        }
        int n = nums.length;
        for (int i = 0; i<=n ; i++){
            sumXor = sumXor ^ i ;
        }
     return sumXor;    
    }
   
}