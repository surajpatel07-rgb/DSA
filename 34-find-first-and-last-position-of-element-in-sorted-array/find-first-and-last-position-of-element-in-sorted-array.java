class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target)
            return new int[]{-1, -1};

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }

    int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}
          