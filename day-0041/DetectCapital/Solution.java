class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
        {
            return true;
        }
        if(word.equals(word.toLowerCase()))
        {
            return true;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)-'A'<32){
                return false;
            }
        }
        return true;
    }
}