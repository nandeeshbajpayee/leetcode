import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();

        if (s.length() < k) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stack.isEmpty() || stack.peek().getFirst() != ch) {
                stack.push(new Pair<>(ch, 1));
            } else {
                int count = stack.pop().getSecond() + 1;
                if (count < k) {
                    stack.push(new Pair<>(ch, count));
                }
            }
        }
        String ans="";
        char ch=' ';
        while(!stack.isEmpty()){
            int count=stack.peek().getSecond();
            ch=stack.pop().getFirst();
            while(count!=0){
                ans=ch+ans;
                count--;
            }
        } 
        return ans;
        
//         StringBuilder sb = new StringBuilder();
//         while (!stack.isEmpty()) {
//             Pair<Character, Integer> pair = stack.pop();
//             char ch = pair.getFirst();
//             int count = pair.getSecond();
//             while (count > 0) {
//                 sb.insert(0, ch);
//                 count--;
//             }
//         }

//         return sb.toString();
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}


