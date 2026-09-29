class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i,j=0,c=0,d=0;
      Map<Character,Integer> m=new HashMap<>();
      for(i=0;i<s.length();i++){
        char ch=s.charAt(i);
        m.put(ch,m.getOrDefault(ch,0)+1);
        if(m.get(ch)>1){
         d++;
         while(d>0){
            char t=s.charAt(j);
            m.put(t,m.get(t)-1);
            if(m.get(t)==1){
                d--;
            }
            else if(m.get(t)==0){
                m.remove(t);
            }
            j++;
         }
        }
        c=Math.max(c,m.size());
      }
      return c;
    }
}