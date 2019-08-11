package com.github.user3301.datastructures.test;

import com.github.user3301.datastructures.Graphs.MST;
import org.junit.Test;

public class MSTTest {

    @Test
    public void MSTTest() {
        int vertices = 6;
        MST graph = new MST(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.primMST();
        graph.printMST();
    }
}
