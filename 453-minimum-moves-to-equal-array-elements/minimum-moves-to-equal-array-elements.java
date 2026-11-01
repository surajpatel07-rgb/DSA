class Solution {
    public int minMoves(int[] nums) {
        int min  = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min,x);
        }
        int count = 0 ;
        for(int x : nums){
            count += x -min;
        }
        return count;
    }
}