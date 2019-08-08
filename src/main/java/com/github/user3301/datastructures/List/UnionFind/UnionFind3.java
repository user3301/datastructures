package com.github.user3301.datastructures.List.UnionFind;

/**
 * union based on node size
 */
public class UnionFind3 {
    private int[] parent;
    private int[] sz;  // sz[i] 表示以i为根的集合中元素的个数
    private int count;

    public UnionFind3(int n) {
        this.count = n;
        parent = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }

    }

    public int find(int p) {
        if(p < 0 || p > count) {
            return -1;
        }

        while(p!=parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int qRoot = find(q);
        int pRoot = find(p);
        if(sz[pRoot] > sz[qRoot]) {

            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        else {
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
    }


}
