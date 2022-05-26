import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NodeTest {

    public Node node = new Node("node");

    @Test
    public void testNode1() {
        assertNotNull(new Node("node"));
        assertTrue("node".equals(node.getName()));
    }

    @Test
    public void testNode2() {
        Node[] nodeList = new Node[1];
        nodeList[0] = node;
        Node newNode = new Node("nodeList", nodeList);
        assertTrue("node".equals(newNode.getName()));
    }
}