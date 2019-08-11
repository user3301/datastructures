package com.github.user3301.datastructures.test;

import com.github.user3301.datastructures.Graphs.SparseGraph;
import org.junit.Assert;
import org.junit.Test;

public class SparseGraphTest {

    @Test
    public void sparseGraphTest() throws Exception {
        SparseGraph sparseGraph = new SparseGraph(5, false);
        sparseGraph.printGraph();
        sparseGraph.addEdge(0,1);
        sparseGraph.printGraph();
        boolean actual = sparseGraph.isConnected(0,1);
        Assert.assertEquals(true, actual);
    }
}
