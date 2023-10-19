class Solution {
    public int addDigits(int num) {
        int k=0;
        while(num>9){
            int sum=0;
            while(num!=0){
            k=num%10;
            num=num/10;
            sum+=k;
        }
            num=sum;
        }
        return num;
    }
}