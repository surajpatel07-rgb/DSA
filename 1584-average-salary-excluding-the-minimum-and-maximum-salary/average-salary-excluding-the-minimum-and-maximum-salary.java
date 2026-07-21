class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int s : salary){
            sum += s;
            min = Math.min(min,s);
            max = Math.max(max,s);
        }      
        sum-= (max + min) ;
        return (double) sum / (salary.length - 2);
    }
}