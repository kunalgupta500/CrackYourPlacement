class Solution {
    public String reverseVowels(String s) {
    ArrayList<Character> lst=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
                lst.add(c);
            }
        }
        String ans="";
        int idx=lst.size()-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
                ans+=lst.get(idx--);
            }
            else{
                ans+=c;
            }
        }
        return ans;
    }
}