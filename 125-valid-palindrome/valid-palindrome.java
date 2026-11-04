class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder str = new StringBuilder();
       // remove spaces and special chars
       for(int i = 0 ; i< s.length(); i++){
        char ch  = s.charAt(i);
       
       if(Character.isLetterOrDigit(ch)){
        str.append(Character.toLowerCase(ch));
       }
       }
       // reverse kiya hai and convert kiya hai into strings from char
       String original = str.toString();
       String reverse = str.reverse().toString();
       // just compared
       return original.equals(reverse);

    }
}