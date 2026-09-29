class Solution {
    public String longestPalindrome(String s) {
        int i,j=0;
        String ans="";
        for(i=0;i<s.length();i++){
            j=0;
            String t=s.substring(j,i+1);
            if(!pal(t)){
                while(pal(t)==false){
                t=s.substring(j,i+1);
                j++;
                }
            }
           if(t.length()>ans.length()){
            ans=t;
           }
            
        }
        return ans;
    }
    public boolean pal(String t){
        int k;
        for(k=0;k<(t.length()/2);k++){
            if(t.charAt(k)!=t.charAt(t.length()-k-1)){
               return false;
            }
        }
        return true;
    }
}