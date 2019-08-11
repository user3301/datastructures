package com.github.user3301.datastructures.Graphs;

/**
 * dense graph implemented by adjacent matrix 邻接矩阵实现稠密图
 */
public class DenseGraph {

    private boolean[][] graph;
    private int n; // node count
    private int m; // path count
    private boolean isDirected;

    public DenseGraph(boolean directed, int n) {
        isDirected = directed;
        this.n = n;
        this.m = 0;
        graph = new boolean[n][];
        for (int i = 0; i < n; i++) {
            graph[i] = new boolean[n];
        }
    }

    public int E() {
        return m;
    }

    public int V() {
        return n;
    }

    public void addEdge(int v, int w) throws Exception {
        if (v < 0 || v >= graph.length || w < 0 || w >= graph.length) {
            throw new Exception("the node is not in the graph.");
        }

        if (hasEdge(v, w))
            return;

        graph[v][w] = true;

        if (!isDirected) {
            graph[w][v] = true;
        }

        m++;
    }

    public boolean hasEdge(int v, int w) {
        return graph[v][w];
    }

    public void printGraph() {
        System.out.println("=================");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}