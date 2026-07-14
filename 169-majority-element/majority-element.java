class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int a : nums){
            freq.put(a,freq.getOrDefault(a,0) + 1);

        }
        int result = -1;
        int maxfreq = -1;
        for(int key : freq.keySet()){
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq  > maxfreq){
                maxfreq = currentKeyFreq;
                result = key ;
            }
        }
        return result;
         
          }
    
    }