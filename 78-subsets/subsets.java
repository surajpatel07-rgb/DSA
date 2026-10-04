class Solution {
    public void solve(int[] nums,int index,List<Integer> output,List<List<Integer>> ans){
        if(index == nums.length){
            ans.add( new ArrayList<>(output));
            return;
        }
        //take
        output.add(nums[index]);
        solve(nums,index+1,output,ans);
        //remove
        output.remove(output.size() - 1);
         solve(nums,index+1,output,ans);
        //
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums,0,output,ans);
        return ans;
    }
}