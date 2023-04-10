class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int num=0;
        int k;
        if(n<0)return false;
        while(x!=0){
            k=x%10;
            num=(num*10)+k;
            x/=10;
            
        }
        return n==num;
    }
}