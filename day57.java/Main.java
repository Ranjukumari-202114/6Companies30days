/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//427. Construct Quad Tree



class Solution {
    public Node construct(int[][] grid) {
        if (grid == null || grid.length == 0) return null;
        return dfs(grid, 0, 0, grid.length);
    }
    
    private Node dfs(int[][] grid, int i, int j, int n) {
        boolean val = grid[i][j] == 1;
        if (n == 1) return buildLeaf(val);
        
        int len = n / 2;
        Node topL = dfs(grid, i, j, len);
        Node topR = dfs(grid, i, j + len, len);
        Node botL = dfs(grid, i + len, j, len);
        Node botR = dfs(grid, i + len, j + len, len);
        if (topL.isLeaf && topR.isLeaf && botL.isLeaf && botR.isLeaf
           && topL.val == topR.val && botL.val == botR.val && topL.val == botL.val) {
            return buildLeaf(val);
        }
        return new Node(val, false, topL, topR, botL, botR);
    }
    
    private Node buildLeaf(boolean val) {
        Node node = new Node();
        node.val = val;
        node.isLeaf = true;
        return node; 
        
    }
}