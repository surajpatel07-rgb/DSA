class Solution {
    static void solve(String digits,String mapping[],List<String> ans ,int index,StringBuilder output){
        if( index >= digits.length()){
            ans.add(output.toString());
            return;
        }
        int value  = digits.charAt(index) - '0';
        String mapped = mapping[value];
        for(int i = 0 ; i< mapped.length() ; i++){
            output.append(mapped.charAt(i));
            solve(digits,mapping,ans,index+1,output);
            output.deleteCharAt(output.length() -1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        int index = 0;
        StringBuilder output = new StringBuilder();
        solve(digits,mapping,ans,index,output);
        return ans;
        }
        }