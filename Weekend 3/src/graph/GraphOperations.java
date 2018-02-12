package graph;

import java.util.Set;

public class GraphOperations {

    public static int departmentConnections(Graph graph, Set<Vertex> department1, Set<Vertex> department2) {

        int counter = 0;

        Set<com.sun.javafx.geom.Edge> setEdges = graph.getEdges();

        for (Vertex v2 : department2) {

            for (Vertex v1 : department1) {

                Edge testEdge = new Edge(v2, v1);

                if (setEdges.contains(testEdge)) {

                    counter++;

                }

            }

        }

        return counter;

        //Do the thing! Happy coding ;)

    }
}

/*
    They will give you a graph of this social network where vertices (nodes) represent people and friendships are edges
        between vertices. You will be given two departments and you need to analyze the inter-department friendships
        between them. You will pass the data back to HR and they will decide what to do with the very isolated
        departments - throw a party for them, most likely.*/

/*

More formally, you will receive a Graph object representing the social network of your workplace, and two Sets of Vertex
    objects representing two departments. Your job is simple: count the connections (Edges) between the two departments
        (but don't count edges inside a department or edges where an endpoint is not in any of the departments.

        Graph, Vertex and Edge will all be preloaded for you and should not be modified. The methods that should interest
        you in this kata are the following:

public Set<Vertex> getVertices() in Graph that returns a set of all vertices of the graph.

public Set<Edge> getEdges() in Graph that returns a set of all edges of the graph.

public Vertex getV1() and public Vertex getV2() in Edge that return the Vertex endpoints of an edge.

        Both Vertex and Edge has hashCode and equals implemented.

        */




  /*  Please note the following:

        The graph is undirected (you can travel both ways on any edge - if you know someone, he/she knows you as well)
        The graph is unweighted (each edge counts as 1)
        There are no loop edges (edges that have the same vertex as both ends)
        There are no multiple edges (paralell edges between two vertices - you either know someone, or you don't)
        Hashcode-equals implemented for Vertex and Edge as well.
        Two edges are equal if their endpoints are equal regardless of their order*/