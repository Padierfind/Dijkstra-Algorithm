package Dijkstra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This is the main algorithm class thats used to evaluate a graph.
 */
public class DijkstraAlgorithm
{
    private Node firstNode;
    private Node currentNode;
    private List<Node> queue = new ArrayList<Node>();
    private Node finalNode;

    /**
     * Call this function to evaluate a graph.
     * It calculates the shortest path of nodes from the starting node to the final node in the form of a List of Nodes.
     * @param inputGraph The graph that should be evaluated
     * @return List of Nodes.
     */
    public List<Node> GetShortestPath(Graph inputGraph)
    {
        List<Node> nodes = inputGraph.GetNodes();

        firstNode = nodes.get(0);
        firstNode.SetValue(0);
        finalNode = nodes.get(nodes.size() - 1);

        currentNode = firstNode;
        queue.add(currentNode);

        for(Node n : nodes.subList(1, nodes.size())) // Set the values all nodes, except the starting node to an infinite / impossible number
        {
            n.SetValue(-1);
        }

        while(queue.isEmpty() == false)
        {
            CalculateOutboundEdges();
        }

        List<Node> returnList = FindShortestPathBasedOnPreviousNode();
        ClearValues();
        return returnList;
    }

    /**
     * This method calculates the values of every outbound edge of the current node.
     */
    private void CalculateOutboundEdges ()
    {
        queue.remove(currentNode);

        List<Edge> currentNodeOutboundEdges = currentNode.GetOutboundEdges();

        for(Edge e : currentNodeOutboundEdges)
        {
            List<Node> edgeNodes = e.GetNodes();

            for(Node n : edgeNodes)
            {
                if(n.GetName() != currentNode.GetName())
                {
                    if(n.GetValue() == -1)
                    {
                        queue.add(n);
                    }

                    int newVal = currentNode.GetValue() + e.GetValue();

                    if(n.GetValue() == -1 || newVal < n.GetValue())
                    {
                        n.SetValue(newVal);
                        n.SetPreviousNode(currentNode);
                    }
                }
            }
        }

        if(queue.isEmpty() == false)
        {
            currentNode = queue.get(0);
            queue.sort(Comparator.comparing(Node::GetValue)); // Sort List
        }
    }

    /**
     * When all calculations are finished this function sorts the shortest path from start-node to end-node in a list.
     * @return List of Nodes.
     */
    private List<Node> FindShortestPathBasedOnPreviousNode()
    {
        Node currentlyIteratingNode = finalNode;

        List<Node> finalNodeList = new ArrayList<Node>();
        finalNodeList.add(finalNode);

        while(currentlyIteratingNode != null && currentlyIteratingNode.GetName() != firstNode.GetName())
        {
            Node previousNode = currentlyIteratingNode.GetPreviousNode();
            finalNodeList.add(0, previousNode);
            currentlyIteratingNode = previousNode;
        }

        return finalNodeList;
    }

    /**
     * Clears all values of the instance to make it reusable.
     */
    private void ClearValues()
    {
        Node firstNode = null;
        Node currentNode = null;
        List<Node> queue = new ArrayList<Node>();
        Node finalNode = null;
    }
}
