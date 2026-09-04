package com.snpsu.DataStructure.Graphs.Traversal.BFS;

import java.util.*;

public class GraphBFS {
    int v;
    GraphBFS(int v){
        this.v = v;
    }

    ArrayList<Integer> bfsTraversal(HashMap<Integer, ArrayList<Integer>> adjList){
        boolean[] visted = new boolean[v]; // visited array
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.offer(0);
        visted[0] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for(int neighbour : adjList.get(front)){
                if(!visted[neighbour]){
                    visted[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes and Edges: ");
        int n = sc.nextInt(); // num of nodes
        int e = sc.nextInt(); // num of edges

        // Adjacency List
        HashMap<Integer, ArrayList<Integer>> adjList
                = new HashMap<>();
        // creating an empty arraylist for every node
        for(int i=0; i<n; i++){
            adjList.put(i, new ArrayList<>());
        }
        // add edges
        for(int i=1; i<=e; i++){
            System.out.println("Enter Edge " + i + ": " );
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        // print AdjList (Optional)
        System.out.println("AdjList: ");
        for(int i : adjList.keySet()){
            System.out.println(i + " -> " + adjList.get(i));
        }

        GraphBFS bfs = new GraphBFS(n);
        ArrayList<Integer> ans = bfs.bfsTraversal(adjList);
        System.out.println("BFS Traversal: ");
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
