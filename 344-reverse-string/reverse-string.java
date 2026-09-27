class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length- 1);
    }
    public void reverse(char[] s,int left ,int right){
        // base bnao
        if(left >= right){
            return;
        }
            // swap
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        // recursive reln
      reverse(s,left + 1,right - 1);  
    }
}
