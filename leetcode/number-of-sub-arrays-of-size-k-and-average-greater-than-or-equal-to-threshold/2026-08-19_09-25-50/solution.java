class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int c=0,s=0;
        int i;
        for(i=0;i<k;i++){
            s=s+arr[i];
        }
        if((s/k)>=t){
            c++;
        }
        for(i=i;i<arr.length;i++){
            s=s+arr[i];
            s=s-arr[i-k];
            if(s/k>=t){
                c++;
            }
        }
        return c;
        
    }
}