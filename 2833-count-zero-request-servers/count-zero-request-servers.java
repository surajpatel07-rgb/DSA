import java.util.Arrays;
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        // int[] ans = new int[queries.length];
        // for( int i = 0; i < queries.length; i++){
        //     int start = queries[i] - x;
        //     int end = queries[i];
        //     boolean[] visited = new boolean[n+1];
        //     for(int j = 0; j < logs.length; j++){
        //         int server = logs[j][0];
        //         int time = logs[j][1];

        //         if(time >= start && time <=end){
        //             visited[server] = true;
        //         }
        //     }
        //     int count = 0;
        //     for(int j = 1 ; j<= n ; j++){
        //         if(visited[j] == false){
        //             count++ ; 
        //         }
        //     }
        //     ans[i] = count;
        // }
        // return ans;

  int q = queries.length;
        int[] ans = new int[q];
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries,
            (a, b) -> Integer.compare(a[0], b[0]));
        int[] freq = new int[n + 1];

        int left = 0;
        int right = 0;
        int active = 0;
     for (int i = 0; i < q; i++) {

            int t = sortedQueries[i][0];
            int start = t - x;
          while (right < logs.length &&
                   logs[right][1] <= t) {

                int server = logs[right][0];

                if (freq[server] == 0) {
                    active++;
                }

                freq[server]++;
                right++;
            }
            while (left < right &&
                   logs[left][1] < start) {

                int server = logs[left][0];
                 freq[server]--;

                if (freq[server] == 0) {
                    active--;
                }

                left++;
            }
        int originalIndex = sortedQueries[i][1];

            ans[originalIndex] = n - active;
        }

        return ans;
    }
}
