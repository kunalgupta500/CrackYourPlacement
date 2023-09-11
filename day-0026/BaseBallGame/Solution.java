class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if(operations[i].equals("+") && stack.size()>=2){
                int value1 = stack.pop();
                int value2 = stack.pop();
                int value = value1+ value2;
                
                stack.push(value2);
                stack.push(value1);
                stack.push(value);
            }else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        
        System.out.println("Stack" + stack);

        int sum =0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        
        return sum;
    }
}