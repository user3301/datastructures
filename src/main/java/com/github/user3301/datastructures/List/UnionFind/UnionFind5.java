package com.github.user3301.datastructures.List.UnionFind;

/**
 * union optimized with path compression
 */
public class UnionFind5 {
    private int[] parent;
    private int[] rank;
    private int count;

    public UnionFind5(int count) {
        this.count = count;
        parent = new int[count];
        rank = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int p) {
        if(p < 0 || p > count) {
            return -1;
        }
        while(p != parent[p]) {
            parent[p] = parent[parent[p]];  // where magic happens, let p's parent connected to its parent's parent, move tree up one level to compress the path
            p = parent[p];
        }
        return p;
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
        else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
        }
    }
}
