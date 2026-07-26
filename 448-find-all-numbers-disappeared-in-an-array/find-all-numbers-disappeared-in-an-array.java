class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i< n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }
        for (int k = 0; k<n; k++){
            if (nums[k] > 0){
                ans.add(k+1);
            }
            
        }
        return ans;
        
    }
}