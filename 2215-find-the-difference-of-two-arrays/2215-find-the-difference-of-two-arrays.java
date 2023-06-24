class Solution {
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=  new ArrayList();
        List<Integer> arr1= new ArrayList();
        List<Integer> arr2= new ArrayList();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(i!=0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(j!=0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]==nums2[j]){
                i++;j++;continue;
            }
            if(nums1[i]<nums2[j]){
                arr1.add(nums1[i]);
                i++;
            }
            else{
                arr2.add(nums2[j]);
                j++;
            }
            
        }
        while(i<nums1.length) {
            if(i!=0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            arr1.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            if(j!=0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            arr2.add(nums2[j]);
            j++;
        }
        res.add(arr1);
        res.add(arr2);
        return res;
    }
}