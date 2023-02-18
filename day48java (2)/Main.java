/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



589. N-ary Tree Preorder Traversal





class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
     if (root == null) return ans;
        ans.add(root.val);
        for (Node child : root.children)
            preorder(child);
        return ans;   
    }
}