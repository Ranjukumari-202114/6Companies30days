/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



559. Maximum Depth of N-ary Tree






class Solution {
    public int maxDepth(Node root) {
      if(root == null) return 0;

       int maximumDepth = 0;

        for(Node child: root.children)
            maximumDepth = Math.max(maximumDepth , maxDepth(child));

        return maximumDepth + 1;  
    }
}