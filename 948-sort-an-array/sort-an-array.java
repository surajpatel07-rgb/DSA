class Solution {
    static void merge(int[] nums,int s ,int e ,int mid){
        int leftlen = mid - s + 1;
        int rightlen = e - mid;
        int leftarr[] = new int[leftlen];
        int rightarr[] = new int[rightlen];
        // left array mai values copy
        int k = s;
        for(int i = 0;i < leftlen; i++){
            leftarr[i] = nums[k];
            k++;
        }
        k = mid +1;
        for(int j = 0 ; j < rightlen; j++){
            rightarr[j] = nums[k];
            k++;
        }
        // merge kr rhe hai
        int i = 0;
        int j = 0;
         k = s;
        while( i < leftlen && j < rightlen){
            if(leftarr[i] <= rightarr[j]){
                nums[k] = leftarr[i];
                k++;
                i++;
            }
            else{
                nums[k] = rightarr[j];
                k++;
                j++;
             }
        }
             // suppose one is completetly consumed
             // right is consumed
             while( i  < leftlen){
                nums[k] = leftarr[i];
                i++;
                k++;
             }
             // left is consumed
             while( j < rightlen){
                nums[k] = rightarr[j];
                j++;
                k++;
             }
        }
    
    public void mergesort(int[] nums,int s,int e){
        // base case
        if(s >= e){
            return;
        }
        int mid =  s + (e-s)/2;
        // left sort
        mergesort(nums,s,mid);
        // right sort
        mergesort(nums,mid + 1,e);
        // merge
        merge(nums,s,e,mid);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length - 1);
        return nums;
    }
}