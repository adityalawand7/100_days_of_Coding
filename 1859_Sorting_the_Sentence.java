class Solution {
    public String sortSentence(String s) {
        String[] sArr = s.split(" ");
        String[] oriArr = new String[sArr.length];
        StringBuilder original = new StringBuilder();
        for(int i = 0; i < sArr.length; i++){
            int idx = (int)(sArr[i].charAt(sArr[i].length()-1));
            oriArr[idx - 48 - 1] = sArr[i];
        }
        for(int i = 0; i < oriArr.length; i++){
            oriArr[i] = oriArr[i].substring(0,oriArr[i].length()-1) + " ";
            if(i == oriArr.length - 1){
                oriArr[i] = oriArr[i].substring(0,oriArr[i].length()-1);
            }
        }
        for(int i = 0; i < oriArr.length; i++){
            original.append(oriArr[i]);
        }
        return original.toString();
    }
}
