class Solution {
    public int countComponents(int n, int[][] edges) {
        int [] parent = new int[n];
        int [] rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int i = 0; i < edges.length; i++) {
            union(edges[i][0], edges[i][1], parent, rank);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(find(i, parent));
        }

        return set.size();
    }

    private int find(int src, int [] parent) {
        if (src != parent[src]) {
            parent[src] = find(parent[src], parent);
        }

        return parent[src];
    }

    private void union(int src, int dest, int [] parent, int [] rank) {
        int srcParent = find(src, parent);
        int destParent = find(dest, parent);

        if (srcParent != destParent) {
            if (rank[srcParent] < rank[destParent]) {
                parent[srcParent] = destParent;
            } else if (rank[srcParent] > rank[destParent]) {
                parent[destParent] = srcParent;
            } else {
                parent[srcParent] = destParent;
                rank[destParent]++;
            }
        }
    }
}
