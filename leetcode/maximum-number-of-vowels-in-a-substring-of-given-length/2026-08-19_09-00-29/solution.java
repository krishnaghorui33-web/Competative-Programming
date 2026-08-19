class Solution {
    public int maxVowels(String s, int k) {
        int i=0,c=0,mx=0;
        String v="aeiou";
        for(i=0;i<k;i++){
            char ch=s.charAt(i);
            if(v.indexOf(ch)!=-1){
                c++;
            }
        }if(c>mx){mx=c;}
        for(i=i;i<s.length();i++){
            if(v.indexOf(s.charAt(i))!=-1){
                c++;
            }
            if(v.indexOf(s.charAt(i-k))!=-1){
                c--;
            }
                if(c>mx){mx=c;}
        }
        return mx;
        
    }
}