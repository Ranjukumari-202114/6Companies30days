/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean isValid(String s) {
     Stack<Character> stackOb = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                stackOb.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
                stackOb.pop();
            } else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            } else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return stackOb.isEmpty();    
    }
}