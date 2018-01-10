package Dijkstra;

import java.util.List;

/**
 * This is the basic class of the Graph. The Dijkstra DijkstraAlgorithm requires an instance of this class in order to run.
 */
public class Graph
{
    /**
     * @param initNodes A list of Node instances which the Graph should contain.
     */
    public Graph(List<Node> initNodes)
    {
        nodes = initNodes;
    }

    private List<Node> nodes;
    public List<Node> GetNodes()
    {
        return nodes;
    }
}
