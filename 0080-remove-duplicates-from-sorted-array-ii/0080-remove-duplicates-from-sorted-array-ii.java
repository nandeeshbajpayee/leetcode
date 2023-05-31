class Solution {
    public int removeDuplicates(int[] nums) {
      Stack<Integer> stack =new Stack<>();
        int count=1;
        if(nums.length<=2) return nums.length;
        for(int i=0;i<nums.length;i++){
            if(stack.isEmpty()){
                stack.push(nums[i]);
                continue;
            }
            else if(stack.peek()!=nums[i]){
                count=1;
            }
            else {
                count++;
            }
            if(count<=2) {
                stack.push(nums[i]);
            }
        }
        int len = stack.size();
        int index = len - 1;
        while (!stack.isEmpty()) {
            nums[index] = stack.pop();
            index--;
        }
        return len;
    }
}