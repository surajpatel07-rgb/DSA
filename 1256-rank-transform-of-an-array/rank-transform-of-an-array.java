class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> rankmap = new HashMap<>();
        int rank = 1;
        for(int nums : sorted){
            if(!rankmap.containsKey(nums)){
                rankmap.put(nums,rank++);
            }
        }
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            result[i] = rankmap.get(arr[i]);
        }
        return result;
          }
}