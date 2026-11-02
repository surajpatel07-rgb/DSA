class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // int median =nums[n / 2];
        // long ans = 0;
        // for(int a : nums){
        //     ans += Math.abs( (long) a  - median);
        // }
        // return (int) ans;
    int i = 0;
    int j = n -1;
    int moves = 0;
    while(i < j){
       moves += nums[j] - nums[i];
       j-- ;
       i++; 
    }
    return moves;
    }
}