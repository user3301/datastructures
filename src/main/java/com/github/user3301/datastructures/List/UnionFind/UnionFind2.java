package com.github.user3301.datastructures.List.UnionFind;

public class UnionFind2 {
    private int[] parent;
    private int count;

    public UnionFind2(int n) {
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        if(p < 0 || p > count) {
            return -1;
        }
        while(p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p , int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot) {
            return;
        }

        parent[pRoot] = qRoot;
    }
}
