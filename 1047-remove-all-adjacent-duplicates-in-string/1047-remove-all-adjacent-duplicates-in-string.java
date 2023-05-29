class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        int k=0;
        while(k< s.length()){
            if(stack.isEmpty() || stack.peek()!=s.charAt(k))
                stack.push(s.charAt(k));
            else
                stack.pop();
            k++;
        }
        String ans="";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        String answer="";
         for (int i=0; i<ans.length(); i++){
            answer= ans.charAt(i)+answer;
         }
        return answer;
    }
}