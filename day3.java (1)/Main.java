/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
     final int n = amount.length;
    List<Integer>[] graph = new List[n];
    int[] parent = new int[n];
    int[] aliceDist = new int[n];
    Arrays.fill(aliceDist, -1);

    for (int i = 0; i < n; ++i)
      graph[i] = new ArrayList<>();

    for (int[] edge : edges) {
      final int u = edge[0];
      final int v = edge[1];
      graph[u].add(v);
      graph[v].add(u);
    }

    dfs(graph, 0, -1, 0, parent, aliceDist);
    for (int u = bob, bobDist = 0; u != 0; u = parent[u], ++bobDist)
      if (bobDist < aliceDist[u])
        amount[u] = 0;
      else if (bobDist == aliceDist[u])
        amount[u] /= 2;

    return getMoney(graph, 0, -1, amount);
  }

  // Get parent and dist.
  private void dfs(List<Integer>[] graph, int u, int prev, int d, int[] parent, int[] dist) {
    parent[u] = prev;
    dist[u] = d;
    for (final int v : graph[u]) {
      if (dist[v] == -1)
        dfs(graph, v, u, d + 1, parent, dist);
    }
  }

  private int getMoney(List<Integer>[] graph, int u, int prev, int[] amount) {
    // Leaf node.
    if (graph[u].size() == 1 && graph[u].get(0) == prev)
      return amount[u];

    int maxPath = Integer.MIN_VALUE;
    for (final int v : graph[u])
      if (v != prev)
        maxPath = Math.max(maxPath, getMoney(graph, v, u, amount));

    return amount[u] + maxPath;   
        
    }
}