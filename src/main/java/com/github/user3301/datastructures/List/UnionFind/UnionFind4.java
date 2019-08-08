package com.github.user3301.datastructures.List.UnionFind;

/**
 * union based on tree level
 */
public class UnionFind4 {
    private int[] parent;
    private int[] rank;
    private int count;

    public UnionFind4(int count) {
        this.count = count;
        parent = new int[count];
        rank = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;
            rank[i] =1;
        }
    }

    public int find(int p) {
        if(p < 0 || p > count) {
            return -1;
        }
        while(p != parent[p]) {
            p = parent[p];
        }
        return parent[p];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;

        if(rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        }
        else if(rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        }
        else { // rank[p] == rank[q]
            parent[pRoot] = qRoot;
            rank[qRoot]++;
        }
    }
}
