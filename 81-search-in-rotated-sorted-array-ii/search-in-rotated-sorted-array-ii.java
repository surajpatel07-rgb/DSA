class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return true;
            }
            // if repeat horhe hai aap pta ni lga pa rhe ho ki konsi side sorted hai
            if (nums[left] == nums[mid] && nums[right] == nums[mid]){
                left++ ;
                right--;
}
            // left sorted hai
            else if (nums[left] <= nums[mid]){
                if (nums[left] <= target && target <= nums[mid]){
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
            // right sorted hai
            else{
                if (nums[mid] <= target && target <= nums[right]){
                    left = mid +1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}