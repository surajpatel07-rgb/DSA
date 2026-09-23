class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }
        List<Integer> numlist = new ArrayList<>(freq.keySet());
        numlist.sort((a, b) -> freq.get(b) - freq.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = numlist.get(i);
  }
  return result;
}
}