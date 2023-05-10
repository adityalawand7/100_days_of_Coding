class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int ans = 0;
        HashSet<String> transformedString = new HashSet<String>();
        for(int i = 0; i<words.length; i++){
            String m = transformation(words[i]);
            transformedString.add(m);
        }
        return transformedString.size();
    }
    String transformation(String s){
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder str = new StringBuilder();
        for(int j = 0; j<s.length(); j++){
            str.append(morse[(s.charAt(j) - 'a')]);
        }
        return str.toString();
    }
}
