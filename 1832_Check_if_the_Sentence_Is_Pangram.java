class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] pos = new boolean[26];

        for(int i = 0; i<sentence.length(); i++){
            int idx = sentence.charAt(i) - 'a';
            pos[idx] = true;
        }
        
        for(int i = 0; i<26; i++){
            if(pos[i]==false) return false;
        }

        return true;
    }
}
