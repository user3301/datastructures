package com.github.user3301.datastructures.List.UnionFind;

public class UnionFind {
    private int[] id;
    private int count;

    public UnionFind(int n) {
        this.count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int find(int p) {
        if(p < 0 || p > count) {
            return -1;
        }
        return id[p];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(p);
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if(pID == qID) {
            return;
        }

        for (int i = 0; i < count; i++) {
            if(id[i] == pID) {
                id[i] = qID;
            }
        }
    }
}
