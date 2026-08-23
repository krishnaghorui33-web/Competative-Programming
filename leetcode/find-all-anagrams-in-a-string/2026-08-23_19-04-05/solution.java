class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        char[] pp=p.toCharArray();
        Arrays.sort(pp);
         String ps=new String(pp);
        int n=s.length();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            String t=s.substring(i,i+k);
            char[] te=t.toCharArray();
            Arrays.sort(te);
            t=new String(te);
            if(ps.equals(t)){
                l.add(i);

            }

        }
          return l;
        
    }
}