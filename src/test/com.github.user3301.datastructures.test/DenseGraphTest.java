package com.github.user3301.datastructures.test;

import com.github.user3301.datastructures.Graphs.DenseGraph;
import org.junit.Test;

/**
 * DenseGraphTest
 */
public class DenseGraphTest {

    @Test
    public void test() throws Exception {
        DenseGraph denseGraph = new DenseGraph(false, 5);

        denseGraph.printGraph();

        denseGraph.addEdge(0,1);
        denseGraph.printGraph();
    }
}