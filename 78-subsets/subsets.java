class Solution {
    public void solve(int[] nums,int index,List<Integer> output,List<List<Integer>> ans){
        if(nums.length<= index){
            ans.add(new ArrayList<>(output));
            return ;
        }
  // include
   int currvalue = nums[index];
   output.add(currvalue);
   solve(nums,index+1,output,ans);
   output.remove(output.size() - 1);
   solve(nums,index+1,output,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;
    }
}