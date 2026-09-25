class Solution {
    public int compress(char[] chars) {
        int readindex = 0;
        int writeindex = 0;
        while( readindex < chars.length){
            char current = chars[readindex];
            int count = 0;
            while( readindex < chars.length && chars[readindex] == current){
                count++ ;
                readindex++ ;
            }
            chars[writeindex] = current;
            writeindex++; 
            if(count > 1){
                String countString = String.valueOf(count);
                for (int j = 0; j < countString.length(); j++) {
                    chars[writeindex] = countString.charAt(j);
                    writeindex++;
            }
            }
        }
        return writeindex;
    }
}