package dataStructures.graphs;

public class Main {
    public static void main(String args[])
    {
        Graphs graph=new Graphs();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.print();
        graph.addEdge("A","B");
        graph.addEdge("B","C");
        graph.print();
        graph.removeVertex("B");
        graph.print();
    }
}
