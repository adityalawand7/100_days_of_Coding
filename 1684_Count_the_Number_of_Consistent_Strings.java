class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        boolean[] allowedAlp = new boolean[26];
        for(int i = 0; i<allowed.length(); i++){
            allowedAlp[allowed.charAt(i) - 'a'] = true;
        }
        for(String word:words){
            if(checkWord(word, allowedAlp)){
                ans += 1;
            }
        }
        return ans;
    }
    public boolean checkWord(String word, boolean[] allowedAlp){
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(allowedAlp[c-'a']==false){
                return false;
            }
        }
        return true;
    }
}
