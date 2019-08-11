package com.github.user3301.datastructures.Graphs;

import javafx.util.Pair;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MST {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;
    private ResultSet[] resultSets;


    public MST(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        resultSets = new ResultSet[vertices];
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
        int[] key = new int[vertices];


        for (int i = 0; i < vertices; i++) {
            key[i] = Integer.MAX_VALUE;
            resultSets[i] = new ResultSet();
        }

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(vertices, new Comparator<Pair<Integer, Integer>>() {
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                //sort using key values
                int key1 = p1.getKey();
                int key2 = p2.getKey();
                return key1-key2;
            }
        });

        //create the pair for for the first index, 0 key 0 index
        key[0] = 0;
        Pair<Integer, Integer> p0 = new Pair<>(key[0],0);
        //add it to pq
        pq.offer(p0);

        resultSets[0] = new ResultSet();
        resultSets[0].parent = -1;

        while(!pq.isEmpty()) {
            Pair<Integer,Integer> extractedPair = pq.poll();
            int extractedVertex = extractedPair.getValue();
            mst[extractedVertex] = true;

            LinkedList<Edge> list = adjacencyList[extractedVertex];
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);

                if(mst[edge.destination] == false) {
                    int destination = edge.destination;
                    int newKey = edge.weight;

                    if(key[destination]> newKey) {
                        Pair<Integer, Integer> p = new Pair<>(newKey, destination);
                        pq.offer(p);

                        resultSets[destination].parent = extractedVertex;
                        resultSets[destination].weight = newKey;

                        key[destination] = newKey;
                    }
                }
            }
        }
    }

    public void printMST() {
        int total_min_weight = 0;
        System.out.println("Minimum Spanning Tree: ");
        for (int i = 1; i <vertices ; i++) {
            System.out.println("Edge: " + i + " - " + resultSets[i].parent +
                    " key: " + resultSets[i].weight);
            total_min_weight += resultSets[i].weight;
        }
        System.out.println("Total minimum key: " + total_min_weight);
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
