package com.github.user3301.datastructures.Graphs;

import java.util.ArrayList;
import java.util.List;

public class SparseGraph {
    private int n;
    private int m;
    private boolean isDirected;
    private List<List<Integer>> g;

    public SparseGraph(int n, boolean isDirected) {
        this.n = n;
        this.m = 0;
        this.isDirected = isDirected;
        g = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<Integer>());
        }
    }

    public int E() {
        return m;
    }

    public int V() {
        return n;
    }

    public boolean isConnected(int v, int w) throws Exception {
        if(v < 0 || v >= n || w < 0 || w >= n) {
            throw new Exception("node out of range.");
        }
        List<Integer> connections = g.get(w);
        for (int i = 0; i < connections.size(); i++) {
            if(connections.get(i) == v) {
                return true;
            }
        }
        return false;
    }

    public void addEdge(int v, int w) throws Exception {
        if(v < 0 || v >= n || w < 0 || w >= n) {
            throw new Exception("node out of range.");
        }

        if(isConnected(v,w)) return;

        g.get(v).add(w);
        if(!isDirected) {
            g.get(w).add(v);
        }
        m++;
    }

    public void printGraph() {
        System.out.println("===============");
        for (int i = 0; i < g.size(); i++) {
            for (int j = 0; j < g.get(i).size(); j++) {
                System.out.print(g.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
