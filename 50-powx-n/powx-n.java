class Solution {
    public double myPow(double x, int n) {
        // base case
        if( n == 0){
            return 1;
        }
        long power = n;
        if( power < 0){
            x = 1/x;
            power = -power;
        }
        return power(x,power);
    }
    public double power(double x , long n){
        if( n == 0){
            return 1;
        }
        double half = power(x,n/2);
        if( n % 2 == 0){
            return half * half ;
        }
        else{
            return x * half * half;
        }
    }
}