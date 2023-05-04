class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(int i = 0; i<words.length; i++){
            if(hasPrefix(words[i], pref)==true)
                ans += 1;
        }
        return ans;
    }

    boolean hasPrefix(String s, String pref){
        if(s.length()<pref.length())
            return false;
        String sub_string = s.substring(0,pref.length());
        if(sub_string.equals(pref))
            return true;
        return false;
    }
}
