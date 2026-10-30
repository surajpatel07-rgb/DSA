class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        // sort
        int[] arr = nums.clone();
        Arrays.sort(arr); 
        // middle
        int mid = (n + 1) /2;
        // left and right ko fill krna hai odd indices pe bada and even indices pe chota
      int left = mid -1;
        int right = n -1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                nums[i] = arr[left];
                left = left -1;
            }
            else{
                nums[i] = arr[right];
                right = right-1;
            }
        }
    }
}