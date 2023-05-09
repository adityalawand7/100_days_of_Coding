class Solution {
    public String interpret(String command) {
        // String ans = ""; 
        StringBuilder ans = new StringBuilder(); //using StringBuilder class to reduce time and space complexity
        for(int i = 0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                // ans = ans + "G";
                ans.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    // ans = ans + "o";
                    ans.append("o");
                }
                else{
                    // ans = ans + "al";
                    ans.append("al");
                }
            }
        }
        return ans.toString();
    }
}
