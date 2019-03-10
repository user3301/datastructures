package Test;

import com.github.user3301.datastructures.Tree.BinarySearchTree.BinarySearchTree;
import com.github.user3301.datastructures.Tree.BinarySearchTree.Node;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by User3301 on 27/5/17.
 */
public class BinarySearchTreeTest {

    @Test
    public void Test() throws Exception {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.display(binarySearchTree.getRoot());
        assertEquals(true,binarySearchTree.find(4));
        assertEquals(false,binarySearchTree.find(7));
        assertEquals(true,binarySearchTree.delete(1));
        assertEquals(true,binarySearchTree.delete(4));
        assertEquals(2,binarySearchTree.finMin(binarySearchTree.getRoot()));
        assertEquals(6,binarySearchTree.findMax(binarySearchTree.getRoot()));
    }
}
