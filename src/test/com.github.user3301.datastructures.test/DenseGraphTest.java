import com.github.user3301.datastructures.Graphs.DenseGraph;
import org.junit.Test;

/**
 * DenseGraphTest
 */
public class DenseGraphTest {

    @Test
    public void test() {
        DenseGraph denseGraph = new DenseGraph(false, 5);
        denseGraph.printGraph();
    }
}