class Solution {
    public void sortColors(int[] nums) {
        int count = 0,count1=0,count2=0;
 for (int num : nums){
            if (num == 0){
                count++;
            }
            else if (num == 1){
                count1++;
            }
            else{
                count2++;
            }
 }
        int i = 0;
        for (int j = 0; j<count;j++) nums[i++] = 0;
         for (int j = 0; j<count1;j++) nums[i++] = 1;
          for (int j = 0; j<count2;j++) nums[i++] = 2;
         }
}