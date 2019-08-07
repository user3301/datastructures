package com.github.user3301.datastructures.test;

import com.github.user3301.datastructures.List.UnionFind.UnionFind;
import org.junit.Assert;
import org.junit.Test;

public class UnionFindTest {

    @Test
    public void unionFindTest() {
        UnionFind unionFind = new UnionFind(4);
        int zero = unionFind.find(0);
        Assert.assertEquals(0, zero);
        unionFind.union(0,1);
        boolean isConnectedZeroAndOne = unionFind.isConnected(0,1);
        Assert.assertTrue(isConnectedZeroAndOne);

    }
}
