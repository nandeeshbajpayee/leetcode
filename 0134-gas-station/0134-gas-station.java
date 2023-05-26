class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas)<sum(cost)) return -1;
        int start=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            current+=(gas[i]-cost[i]);
            if(current<0){
                start=i+1;
                current=0;
            }
        }
        return start;
    }
    public int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
}




























// int j=0;
//         int i=0;
//         while(i<gas.length){
//         int margin=0;
//         int index=-1;
//         while(i<gas.length){
//             int qura=gas[i]-cost[i];
//             if(qura>margin){
//                 margin = qura;
//                 index=i;
//                 break;
//             } 
//             i++;
//         }
//         i++;
//         if(index==-1) return -1;
//         int ptr=index;
//         int ted=gas[ptr];
//         boolean flag=false;
//         while(ted>=cost[ptr]){
//             ted=ted-cost[ptr];
//             ptr=(ptr+1)%gas.length;
//             ted=ted+gas[ptr];
//             if(ptr==index) {
//                 flag=true;
//                 break;
//             }
//         }
//         if(flag) return index;
//             j++;
//         }
//     }