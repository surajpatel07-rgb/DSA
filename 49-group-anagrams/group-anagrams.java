class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();// str -> char
            Arrays.sort(chars);
            String key = new String(chars);// chars -> str
            if(!map.containsKey(key)){ // if key ni hai to new list bnao
                map.put(key,new ArrayList<>());// boc bnaya aur empty list of strings rkha hus hai
            }
         map.get(key).add(str); // add orginal to its group
        }
        return new ArrayList<>(map.values());
    }
}
// dekho pehle ek hashmap bnaya jisme key string hai aur value list of strings hai then loop lgaya . thn strings ko char main convert kiya taki usko sort kr paye sort ke bad ek string bnali kyunki key apni strings hai then chhck kiya kya pehle se exist krta hai apka key agr ni to key -> value mai array of list example abc -> abc ,bca etc. then at last original word ko list mai add krdiya 