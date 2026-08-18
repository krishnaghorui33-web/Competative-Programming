class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        int n=x,s=0,r=1;
        while(n>0){
            int d=n%10;
            s=s*r+d;
            r=10;
            n=n/10;

        }
        if(s==x){return true;}
        else{return false;}
    }
}