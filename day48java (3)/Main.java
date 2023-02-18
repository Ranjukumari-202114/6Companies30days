/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


590. N-ary Tree Postorder Traversal



class Solution {
    public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList();
    if (root == null) return result;
    postorder(root, result);
    return result;     
    }


    private void postorder(Node root, List<Integer> result) {
    if (root == null) return;
    for (Node node : root.children)
        postorder(node, result);
    result.add(root.val);
    }
}