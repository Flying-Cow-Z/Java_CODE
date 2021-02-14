import java.util.HashMap;
class Solution {
    public char firstUniqChar(String s) {
        if(s == null || s.length() == 0) return ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else
                map.put(c, 1);
        }
        for(int i = 0;i < s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}