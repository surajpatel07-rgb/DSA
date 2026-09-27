class Solution {
    public boolean isPowerOfThree(int n) {
        //base
        if(n == 1){
            return true;
        }
        //invalid wala
        if( n <= 0 || n % 3 != 0 ){
            return false;
        }
         return isPowerOfThree( n / 3);
    }
}