package Dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 * Every Graph instance consists of multiple Node instances. These instances contain information about the name of the name, value, previousNode and other connected nodes.
 */
public class Node
{
    /**
     * @param initName The name of the node.
     */
    public Node(String initName)
    {
        name = initName;
    }
    private String name;
    public String GetName()
    {
        return name;
    }

    private int value;
    public int GetValue()
    {
        return value;
    }
    public void SetValue(int newVal)
    {
        value = newVal;
    }

    private List<Edge> outboundEdges = new ArrayList<Edge>();
    public List<Edge> GetOutboundEdges()
    {
        return outboundEdges;
    }
    public void AddOutboundEdge(Edge outBoundEdge)
    {
        outboundEdges.add(outBoundEdge);
    }

    private Node previousNode;
    public void SetPreviousNode(Node newPreviousNode)
    {
        previousNode = newPreviousNode;
    }
    public Node GetPreviousNode()
    {
        return previousNode;
    }
}