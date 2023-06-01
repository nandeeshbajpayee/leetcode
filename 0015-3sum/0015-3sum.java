import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int rem=nums[j]+nums[k];
                if(rem==-nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                }
                else if(rem>-nums[i]) k--;
                else j++;
            }
        }
        return new ArrayList<>(res);
    }
}
