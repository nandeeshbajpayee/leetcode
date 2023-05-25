class Solution {
    public int maximumSwap(int num) {
        int len=0;
        int dummy=num;
        while(dummy!=0){
            dummy/=10;
            len++;
        }
        int[] arr=new int[len];
        int k=len;
        dummy=num;
        while(dummy!=0){
            int ele=dummy%10;
            dummy/=10;
            arr[k-1]=ele;
            k--;
        }
        int l=0;
        boolean flag=true;
        while(l<len && flag){
            int maxno=Integer.MIN_VALUE;
        int maxindex=0;
        for(int i=l;i<len;i++){
            if(arr[i]>=maxno){
                maxno=arr[i];
                maxindex=i;
            }
        }
        int j=0;
        while(j<maxindex){
            if(arr[j]<maxno){
                int temp=arr[maxindex];
                arr[maxindex]=arr[j];
                arr[j]=temp;
                flag=false;
                break;
            }
            j++;
        }
            l++;
        }
        int retnum=0;
        for(int i=0;i<len;i++){
            retnum=retnum*10+arr[i];
        }
        return retnum;
    }
}