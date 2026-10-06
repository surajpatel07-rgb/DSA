class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // whole
        reverse(nums,0,n-1);
        // k elemetnt start ke
        reverse(nums,0,k-1);
        // last elements
        reverse(nums,k,n-1);
    }
        static void reverse(int[] nums,int i ,int j){
        while(i<j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
          j--;
        }
       
    }
}