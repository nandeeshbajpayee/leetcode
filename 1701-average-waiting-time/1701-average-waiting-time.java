class Solution {
    public double averageWaitingTime(int[][] customers) {
        int ft=-1;
        double wait=0;
        for(int[] customer: customers){
           ft=ft>customer[0]?ft:customer[0];
           ft+=customer[1];
           wait+=(ft-customer[0]); 
       }
        return wait/customers.length;
    }
}