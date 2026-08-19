class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,s=0;
        double mx=Integer.MIN_VALUE;
        for(i=0;i<k;i++){
            s=s+nums[i];
        }
        if(((double)s/k)>mx){mx=(double)s/k;}
        for(i=i;i<nums.length;i++){
            s=s+nums[i];
            s=s-nums[i-k];
            if(((double)s/k)>mx){mx=(double)s/k;}
        }
        return mx;
        
    }
}