package Dijkstra;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        InitializeGraph initGraph = new InitializeGraph();
        Graph Graph1 = initGraph.ExampleGraph1();
        Graph Graph2 = initGraph.ExampleGraph2();

        DijkstraAlgorithm alg = new DijkstraAlgorithm();
        List<Node> shortestPathGraph1 = alg.GetShortestPath(Graph1);

        DijkstraAlgorithm alg2 = new DijkstraAlgorithm();
        List<Node> shortestPathGraph2 = alg2.GetShortestPath(Graph2);

        System.out.println("Graph 1:");
        for(Node n : shortestPathGraph1)
        {
            System.out.println(n.GetName());
        }

        System.out.println("Graph 2:");
        for(Node n : shortestPathGraph2)
        {
            System.out.println(n.GetName());
        }

    }
}
