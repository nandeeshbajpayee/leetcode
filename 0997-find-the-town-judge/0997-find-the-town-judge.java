class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        int[] arr=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0];
            arr[a]--;
            int b=trust[i][1];
            arr[b]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n-1) return i;
        }
        return -1;
    }
}