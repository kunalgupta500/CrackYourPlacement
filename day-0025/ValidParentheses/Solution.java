mport java.util.Stack;
class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
         char[] arr=s.toCharArray();
         for(int i=0;i<arr.length;i++)
         {
             if(stack.empty())
             {
                 stack.push(arr[i]);
             }
             else if(stack.peek()=='(' && arr[i]==')')
             {
                 stack.pop();
             }
              else if(stack.peek()=='[' && arr[i]==']')
             {
                 stack.pop();
             }
              else if(stack.peek()=='{' && arr[i]=='}')
             {
                 stack.pop();
             }
             else
             {
                 stack.push(arr[i]);
             }
         }
         return stack.isEmpty();
    }
}