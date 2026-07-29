class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int [] customer : accounts){
            int customerWealth = 0;
            for (int money : customer){
                customerWealth += money;
            }
            maxWealth = Math.max(maxWealth,customerWealth);
        }
        return maxWealth;
        
    }
}