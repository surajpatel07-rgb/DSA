
class Solution {
    public int climbStairs(int n, int[] costs) {

        int INF = 1000000000;

        int a = INF;
        int b = INF;
        int c = 0;

        for (int i = 1; i <= n; i++) {

            int curr = Math.min(
                c + costs[i - 1] + 1,
                Math.min(
                    b + costs[i - 1] + 4,
                    a + costs[i - 1] + 9
                )
            );

            a = b;
            b = c;
            c = curr;
        }

        return c;
    }
}

