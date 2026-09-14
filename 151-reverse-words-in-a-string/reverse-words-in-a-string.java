class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i  = s.length()-1;
        while(i>=0){
            // removing kr rhe hai trailing spaces
            while(i>=0 && s.charAt(i) == ' '){
                i-- ; 
            }
           // check value of i 
            if(i < 0){
                break;
            }
            int j = i;
            //first starting word from end
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi space pr j aye wo ruk jaye aur ans pe apend krde and space minus krna hai aur ans mai add bhi
            ans.append(s.substring(j+1,i+1));
            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }
            if(j >= 0){
                ans.append(' ');
            }
            i=j;
        }
return ans.toString();
    }
}