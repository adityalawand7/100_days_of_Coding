class Solution {
    public List<String> cellsInRange(String s) {
        char[] sc = s.toCharArray();
        List<String> ar = new ArrayList<>();
        for(char c1=sc[0]; c1<=sc[3]; c1++){
            for(char n1=sc[1]; n1<=sc[4]; n1++){
                ar.add(""+c1+n1);
            }
        }
        return ar;
    }
}
