package com.github.user3301.datastructures.test;

import com.github.user3301.datastructures.List.UnionFind.UnionFind2;
import org.junit.Assert;
import org.junit.Test;

public class UnionFind2Test {
    @Test
    public void unionFind2() {
        UnionFind2 unionFind2 = new UnionFind2(4);
        int idx0 = unionFind2.find(0);
        int idx1 = unionFind2.find(1);
        int idx2 = unionFind2.find(2);
        int idx3 = unionFind2.find(3);

        Assert.assertEquals(0,idx0);
        Assert.assertEquals(1,idx1);
        Assert.assertEquals(2,idx2);
        Assert.assertEquals(3,idx3);

        unionFind2.union(0,1);
        Assert.assertTrue(unionFind2.isConnected(0,1));
    }
}
