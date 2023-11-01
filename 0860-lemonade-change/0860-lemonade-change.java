class Solution {
    public boolean lemonadeChange(int[] bills) {
        long rupee5=0;
        long rupee10=0;
        for(int bill:bills){
            if(bill==5){
                rupee5++;
            }
            else if(bill==10){
                if(rupee5==0) return false;
                else{
                    rupee5--;
                    rupee10++;
                }
            }
            else{
                if(rupee5>=1 && rupee10>=1){
                    rupee5--;
                    rupee10--;
                }
                else if(rupee5>=3){
                    rupee5-=3;
                }
                else return false;
            }
        }
        return true;
    }
}