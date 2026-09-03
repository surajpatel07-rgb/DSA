class Solution {
    static boolean isValidAns(int[] position, int m, int mid){
        int k = 1;
        int p = 0;
        for(int i = 0; i<position.length; i++){
            if(position[i] - position[p] >= mid){
                k++;
                p = i;
                if(k==m){
                    return true;
                }
 }
        }
        return false;
}
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s = 0;
        int e = position[n-1] - position[0];
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s) /2;
            if(isValidAns(position,m,mid)){
                ans = mid;
                s = mid + 1;
   }
            else{
                e = mid -1;
}
        }
        return ans ;
        }
}