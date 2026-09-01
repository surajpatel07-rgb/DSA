class Solution {
    static boolean isvalidsoln(int[] nums,int k ,int mid){
        int paintercount = 1;
        int paintedlength = 0;
        for (int i = 0; i<nums.length;i++){
            if(paintedlength + nums[i] <= mid){
                paintedlength += nums[i];
            }
            else{
                paintercount++;
                paintedlength = 0;
                if(paintercount > k || nums[i] > mid ){
                    return false;
                }
                else{
                    paintedlength += nums[i]; 
                     }
                
                }
            }
            return true;
        }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        for (int i = 0; i<n; i++){
            e += nums[i];
        }
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isvalidsoln(nums,k,mid)){
                ans = mid;
                e = mid - 1;

            }
            else{
                s = mid + 1;
            }

        }
        return ans;
        
    }
}