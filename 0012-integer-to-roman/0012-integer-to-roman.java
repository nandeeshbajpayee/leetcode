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
    // public String intToRoman(int num) {
    //     String[] TH={"","M","MM","MMM"};
    //     String[] HD={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    //     String[] TN={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    //     String[] ON={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    //     return TH[num/1000]+HD[(num%1000)/100]+TN[(num%100)/10]+ON[num%10];
    // }
}