package com.snpsu.DataStructure.Graphs.Representation.AdjMatrix;

public class Graph {
    int v;
    int [][] adjMatrix;

    Graph(int vertices){
        this.v = vertices;
        adjMatrix = new int[v][v];
    }

    void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    void printAdjMat(){
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Drivercode{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,5);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);

        g.printAdjMat();
    }
}