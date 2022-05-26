
/**
 * 
 */
public class Node {
    private String name;
    private Node[] connections;
    private int totalEdges;

    /**
     * 
     * @param name
     */
    public Node(String name) {
        this.name = name;
        this.totalEdges = 0;
    }

    public Node(String name, Node[] connections) {
        for (int i = 0; i < connections.length; i++) {
            this.connections[i] = connections[i];
        }
        this.totalEdges = connections.length;

    }

    public int getTotalEdges() {
        return totalEdges;
    }

    public String getName() {
        return name;
    }

    public void addConnection(Node node) {
        connections[totalEdges] = node;
    }

    public String listConnections() {
        String stringConnections = "[";
        for (int i = 0; i < totalEdges; i++) {
            stringConnections += " " + connections[i].getName() + ", ";
        }
        return stringConnections;
    }

    public Node[] getConnections() {
        return connections;
    }

    public boolean equals(Object other) {
        if (other.getClass() == this.getClass()) {
            Node secondNode = (Node) other;
            if (this.name == secondNode.getName() && this.totalEdges == secondNode.getTotalEdges()) {
                for (int i = 0; i < connections.length; i++) {
                    
                }
            }

        }
        return false;
    }
}