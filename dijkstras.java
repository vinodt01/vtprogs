// Implementation of the Djikistra's Algorithm using Adjacency lists and Matrices
import java.util.*;
public class dijkstras
{

// Finding the mininimum Vertex
private static int findminvertex(int[] distance, boolean[] visited)
{
int minvertex = -1;
for(int i=0;i<distance.length;i++)
{
if(!visited[i] && (minvertex == -1 || distance[i] < distance[minvertex]))
{
minvertex=i;
distance[minvertex] = distance[i];

}
}
return minvertex;
}


private static void dijkstra(int[][] adjacencymatrix)
{
int v=adjacencymatrix.length;
boolean visited[] = new boolean[v];
int distance[] = new int[v];
distance[0] = 0;
for(int i=1;i<v;i++)
{
distance[i]=Integer.MAX_VALUE;
visited[i]=false;
}
for(int i=0 ; i<v-1;i++)
{
//find vertex with min distance
int minvertex = findminvertex(distance,visited);
visited[minvertex] = true;
// Explore neighbours
for(int j=0 ; j<v ;j++)
{
if(adjacencymatrix[minvertex][j]!=0 && !visited[j] && distance[minvertex]!= Integer.MAX_VALUE && distance[minvertex]+adjacencymatrix[minvertex][j] < distance[j])
{
distance[j] = distance[minvertex] + adjacencymatrix[minvertex][j];
}
}
}
for(int i=0 ; i < v ; i++)
{
System.out.println(i+"\t"+distance[i]);
}

}

public static void main(String args[])
{

Scanner s = new Scanner(System.in);
int v = s.nextInt();
int e = s.nextInt();
int adjacencymatrix[][] = new int[v][v];
for(int i=0 ; i<e;i++)
{
int v1= s.nextInt();
int v2 = s.nextInt();
int weight=s.nextInt();
adjacencymatrix[v1][v2] = weight;
adjacencymatrix[v2][v1] = weight;
}
dijkstra(adjacencymatrix);
}

}