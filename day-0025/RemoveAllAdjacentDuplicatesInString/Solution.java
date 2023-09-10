import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
         if (s.length() == 1) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        for(char character: s.toCharArray()) {
            if(!stack.empty() && stack.peek() == character) {
                stack.pop();
            } else {
                stack.push(character);
            }
        }
        String answer = "";
        while(!stack.empty()) {
            answer = stack.pop() + answer;
        }
        return answer;
    }
}