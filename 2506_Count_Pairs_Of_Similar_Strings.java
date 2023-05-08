class Solution {
    public int similarPairs(String[] words) {
        for(int i = 0; i<words.length; i++){
            String str = words[i];
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<words[i].length(); j++){
                set.add(words[i].charAt(j));
            }
            char[] arr = new char[set.size()];
            // String temp = "";
            StringBuilder temp  = new StringBuilder(); //Using StringBuilder instead of String to decrease space usage.
            Iterator<Character> itr = set.iterator();
            while(itr.hasNext()){
                temp.append(Character.toString(itr.next()));
            }
            String strr = temp.toString();
            words[i] = strr;
        }
        int count = 0;
        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
