import java.util.Scanner;

/**
In this class we will store the characteristics of each shape
to be compared.
 */

public class Shape {

    /**
    Fields
     */
    private Node[] nodes;
    private int totalEdges;
    private int degree;
    
    /**
     * 
     * @param names
     * @param connects
     */
    public Shape(String[] names, String[] connects) {
        for (int i = 0; i < connects.length; i++) {
            Node node = new Node(names[i]);
            setConnections(node, connects[i]);
        }

    }

    /**
     * 
     * @param name
     * @return
     */
    public Node getNode(String name) {
        for (int i = 0; i < nodes.length; i++) {
            if (name == nodes[i].getName()) {
                return nodes[i];
            }
        }
        return null;
    }
    
    public Node[] getNodes() {
        return nodes;
    }

    public int getEdges() {
        return totalEdges;
    }

    public int getDegree() {
        return degree;
    }

    public void setNodes() {
        
    }

    public void setEdges(int totalEdges) {
        this.totalEdges = totalEdges;
    }
    public void setDegree(int degree) {
        this.degree = degree;
    }

    public boolean setConnections(Node node, String connections) {
        if (connections != null) {
            Scanner scanner = new Scanner(connections.substring(1, connections.length() - 1));
            connections.replace(",", " ");
            while (scanner.hasNext()) {
                String tempName = scanner.next();
                if (tempName != null) {
                    node.addConnection(getNode(tempName));
                }
            }
            scanner.close();
            return true;
        }
        return true;
    }
}