class Solution {
    static boolean isValidAns(int[] piles,int h,int mid){
        long hours = 0;
        for(int i= 0; i< piles.length; i++){
         hours +=  Math.ceil((double) piles[i] /  mid);
         if(hours > h){
            return false;
         }
   }
   return true;   
}
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans = -1;
        for (int i = 0; i < piles.length; i++){
            if(piles[i] > high)
            high = piles[i];
             }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValidAns(piles,h,mid)){
                ans = mid;
              high = mid - 1;
               }
               else{
                low = mid + 1;
               }
               }
return ans;
         }
}