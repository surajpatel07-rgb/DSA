class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(s == e){
                return nums[s];
                 }
            int currentValue = nums[mid];
            int prevValue = -1;
            if(mid-1 >= 0){
                prevValue = nums[mid-1];
            }
            int nxtValue = -1;
            if(mid + 1 < n){
                nxtValue = nums[mid+1];
            }
            if(currentValue != prevValue && currentValue != nxtValue){
                return currentValue; 
            }
            if(currentValue != prevValue && currentValue == nxtValue){
                int starIndex = mid;
                if((starIndex & 1) == 1){
                    //odd -> ans left m hoga
                     e = mid -1;
                }
                else{
                    //even -> ans right m hoga
                     s = mid +1;
                }
            }
            else if(currentValue == prevValue && currentValue != nxtValue){
                int endIndex = mid;
                if((endIndex & 1) == 1){
                    // end ind odd abs -> right
                    s = mid+1;
                }
                else{
                     e = mid - 1;
                }
            }
          }
            
         return -1;
            }
}