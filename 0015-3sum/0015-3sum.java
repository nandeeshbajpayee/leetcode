import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    int i;
    List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return arr;
        Arrays.sort(nums);
        for(i=0;i<nums.length-2;i++){
            if (i == 0 || nums[i] != nums[i - 1]) {
                helper(i + 1, 0 - nums[i], nums.length - 1, nums);
            }
        }
        return arr;
    }
    public void helper(int j,int rem,int k,int[] nums){
        while(j<k){
            if( j!=i+1 && nums[j]==nums[j-1]){
                j++;
                 continue;
            }
            if(k!=nums.length-1 && nums[k]==nums[k+1]) {
                k--;
                 continue;
            }
            int gora=nums[j]+nums[k];
            if(gora==rem){
                List<Integer> ele=new ArrayList<>();
                ele.add(nums[i]);
                ele.add(nums[j]);
                ele.add(nums[k]);
                arr.add(ele);
                j++;
                k--;
            }
            else if(gora>rem){
                k--;
            }
            else{
                j++;
            }
        }
    }
}
