/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//682. Baseball Game




class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> stack = new Stack<>();
        for (String op: operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int p = stack.pop();
                int sum = p + stack.peek();
                stack.push(p);
                stack.push(sum);
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;  
    }
}