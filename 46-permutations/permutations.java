
import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        solve(nums, new ArrayList<>(), used);
        return ans;
    }
    void solve(int[] nums, List<Integer> output, boolean[] used) {
        if (output.size() == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            output.add(nums[i]);
            used[i] = true;

            solve(nums, output, used);

            output.remove(output.size() - 1);
            used[i] = false;
        }
    }
}
