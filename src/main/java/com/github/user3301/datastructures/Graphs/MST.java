package com.github.user3301.datastructures.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class MST {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    public MST(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<Edge>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList[source].addFirst(edge);

        //无向图
        Edge edgeB = new Edge(destination, source, weight);
        adjacencyList[destination].addFirst(edgeB);
    }

    public void primMST() {
        boolean[] mst = new boolean[vertices]; // 已加入mst的节点



    }
}

class Edge{
    int source;
    int destination;
    int weight;

    public Edge(int src, int dest, int w) {
        source = src;
        destination = dest;
        weight = w;
    }
}

class ResultSet {
    int parent;
    int weight;
}
