class Solution {
    public int findKthLargest(int[] nums, int k) {
       int n = nums.length;
       int target = n -k;
       return quickselect(nums,0,n-1,target);
    }
    public int quickselect(int[] nums,int s,int e,int target){
        //base 
        if(s == e){
            return nums[s];
        }
        // partiton 
        int pivotindex = partition(nums,s,e);
        // if pivot reaches the tar
        if(pivotindex == target){
            return nums[pivotindex];
        }
        // search right
        else if( pivotindex < target){
            return quickselect(nums,pivotindex +1,e,target);
        }
        // right search
        else{
            return quickselect(nums,s,pivotindex -1,target);
        }
    }
    public int partition(int[] nums, int s ,int e){
        int pivotelem = nums[s];
        // count 
        int count = 0;
        for(int i = s +1;i <=e ; i++){
            if(nums[i] <= pivotelem){
                count++; 
            }
        }
        // corect posn of picvot
        int correctpos = s + count ;
        // swap pivot to correct
        int temp = nums[correctpos];
        nums[correctpos] = nums[s];
        nums[s] = temp;
// arrange kro elem around pivot
    int i = s;
    int j = e;
    while( i < correctpos && j > correctpos){
        while( i < correctpos && nums[i] <= pivotelem){
             i++;
        }
        while( j > correctpos && nums[j] > pivotelem){
            j--;
        }
        if( i < correctpos && j > correctpos){
            temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    return correctpos;
    }
}