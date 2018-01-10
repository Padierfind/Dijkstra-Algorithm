package Dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 * Nodes are connected with each other via the Edge class.
 * To instaniate an instance of this class you have to give the constructor information about the two connection nodes and the initial value of the edge.
 */
public class Edge
{
    public Edge(Node firstNode, Node secondNode, int initValue)
    {
        connectedNodes.add(firstNode);
        connectedNodes.add(secondNode);

        value = initValue;
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

    private List<Node> connectedNodes = new ArrayList<Node>();
    public List<Node> GetNodes()
    {
        return connectedNodes;
    }
}