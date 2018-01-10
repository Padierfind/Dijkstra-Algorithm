package Dijkstra;

import java.util.ArrayList;

public class InitializeGraph
{
    public Graph ExampleGraph1()
    {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        Edge ab = new Edge(a, b, 10);
        Edge ac = new Edge(a, c, 20);
        a.AddOutboundEdge(ab);
        a.AddOutboundEdge(ac);

        Edge bd = new Edge(b, d, 50);
        Edge be = new Edge(b, e, 10);
        b.AddOutboundEdge(bd);
        b.AddOutboundEdge(be);

        Edge cd = new Edge(c, d, 20);
        Edge ce = new Edge(c, e, 33);
        c.AddOutboundEdge(cd);
        c.AddOutboundEdge(ce);

        Edge df = new Edge(d, f, 2);
        d.AddOutboundEdge(df);

        Edge ef = new Edge(c, f, 1);
        e.AddOutboundEdge(ef);

        ArrayList<Node> nodes = new ArrayList<Node>()
        {
            {
                add(a); // First Node is alwys the starting point
                add(b);
                add(c);
                add(d);
                add(e);
                add(f);
            }
        };

        Graph graph = new Graph(nodes);

        return graph;
    }

    public Graph ExampleGraph2()
    {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        Edge af = new Edge(a, f, 100);
        Edge ac = new Edge(a, c, 19);
        Edge ad = new Edge(a, d, 21);
        a.AddOutboundEdge(af);
        a.AddOutboundEdge(ac);
        a.AddOutboundEdge(ad);

        Edge bc = new Edge(b, c, 95);
        b.AddOutboundEdge(bc);

        Edge cd = new Edge(c, d, 20);
        Edge ce = new Edge(c, e, 60);
        c.AddOutboundEdge(cd);
        c.AddOutboundEdge(ce);

        Edge df = new Edge(d, f, 51);
        d.AddOutboundEdge(df);


        ArrayList<Node> nodes = new ArrayList<Node>()
        {
            {
                add(a); // First Node is alwys the starting point
                add(b);
                add(c);
                add(d);
                add(e);
                add(f);
            }
        };

        Graph graph = new Graph(nodes);

        return graph;
    }
}
