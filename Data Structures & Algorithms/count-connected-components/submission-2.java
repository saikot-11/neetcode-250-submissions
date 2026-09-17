class Solution {
    public int countComponents(int n, int[][] edges) {
        int [] parents = new int[n];
        int [] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            parents[i] = i;
            ranks[i] = 1;
        }

        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            union(src, dest, parents, ranks);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(find(i, parents));
        }

        return set.size();
    }

    private int find(int src, int [] parents) {
        if (src != parents[src]) {
            parents[src] = find(parents[src], parents);
        }

        return parents[src];
    }

    private void union(int src, int dest, int [] parents, int [] ranks) {
        int srcParent = find(src, parents);
        int destParent = find(dest, parents);

        if (srcParent != destParent) {
            if (ranks[srcParent] > ranks[destParent]) {
                parents[destParent] = srcParent;
            } else if (ranks[srcParent] < ranks[destParent]) {
                parents[srcParent] = destParent;
            } else {
                parents[srcParent] = destParent;
                ranks[destParent]++;
            }
        }
    }
}
