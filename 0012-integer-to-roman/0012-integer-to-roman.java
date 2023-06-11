class Solution {
    public String intToRoman(int num) {
        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[]  val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int ptr=0;
        StringBuilder ans=new StringBuilder(); 
        while(num!=0){
            if(num>=val[ptr]){
                num-=val[ptr];
                ans.append(sym[ptr]);
            }
            else{
                ptr++;
            }
        }
        return ans.toString();
    }
}