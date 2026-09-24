class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder(s);
        int index;
        while((index = ans.indexOf(part)) != -1){
            ans.delete(index,index + part.length());
        }
        return ans.toString();
    }
   
}