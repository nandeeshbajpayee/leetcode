class Solution {
    public int passThePillow(int n, int time) {
      int pillow = -1;
      boolean flip = true;
      while(time!=0){
          if(flip){
              for(int i=2;i<=n&&time!=0;i++){
                  pillow=i;
                  time--;
              }
              flip=false;
          }
          else{
              for(int i=n-1;i>0&&time!=0;i--){
                  pillow=i;
                  time--;
              }
              flip=true;
          }
      }
        return pillow;
        
      
    }
}