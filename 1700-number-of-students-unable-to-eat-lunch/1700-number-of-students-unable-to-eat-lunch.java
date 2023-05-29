class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]={0,0} , n=students.length ,k ;
        for(int  s : students){
            count[s]++;
        }
        for(k=0 ; k<n && count[sandwiches[k]]>0; k++) 
            count[sandwiches[k]]--;
        return n-k;
    }
}