class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>(); 
        for (int a : nums){
            freq.put(a,freq.getOrDefault(a,0) + 1);
 }   
 int threshold = nums.length / 3;
 List<Integer> result = new ArrayList<>();
 for (int key : freq.keySet()){
    int currentSize = freq.get(key);
    if(currentSize > threshold) {
        result.add(key);
    }
 }
 return result;
}
}