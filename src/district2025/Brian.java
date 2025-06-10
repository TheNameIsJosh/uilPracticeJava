/*
 *This problem is really difficult and requires knowledge of 
 *  The Bellman-Ford Algorithm
 *  Instantiating names to numbers
 *  Creating maps and edges 
 *Lets start with the basics
*/
package district2025;

import java.util.*;
import java.io.*;

//Start with the main class 
public class Brian {
  public static void main(String[] args) throws FileNotFoundException {
    // We start a scanner to get the File 
    Scanner scan = new Scanner(new File("brian.dat"));

    // Make a hastable to map names to numbers; Basically
    // String(Name) -> Hashtable -> Corresponding number
    Dictionary<String,Integer> nameToNumber = new Hashtable<>();

    // ArrayList will store edges as 
    // Integer[] edge = new Integer[] {source, endpoint, weight}
    ArrayList<Integer[]> edges = new ArrayList<Integer[]>();

    // Number of trials 
    int trials = scan.nextInt();

    // Loop the number of trials
    for (int i=0;i<trials;i++){
      // Get the number of vertices
      int NumberOfvertices = scan.nextInt();
      // Get the number of edges
      int NumberOfedges = scan.nextInt();
     

      // This part will scan the
      // Name Name Weight 
      // lines and 
      // 1. Push numbers to a hastable, mapping name -> number
      // 2. Create the edge with NumberOfStart, NumberOfEnd, Weight 
      // 3. Add the edge to the edges ArrayList

      for(int j=1;j<=NumberOfedges;j++){
        // Get the startpoint 
        // If not in Dictionary, add it
        String startName = scan.next();  
        if (nameToNumber.get(startName)==null){
          nameToNumber.put(startName,j);
        }

        // Same with endpoint
        String endName = scan.next();
        if(nameToNumber.get(endName)==null){
          nameToNumber.put(endName,++j);

          // Because the vertices are named in terms of j,
          // We also need to subtract j by 1 to have the correct cycle
          --j;
        }

        // Gets the "cost"/weight of an edge,
        // (The minutes taken to travel the path)
        int cost = scan.nextInt();

        // Make the edge with the info
        Integer[] edge = new Integer[]{nameToNumber.get(startName),nameToNumber.get(endName),cost};

        // Add edge to the edges list
        edges.add(edge);
      }

      // Congrats, We have Created a Map!
      // Now we need some info to commence the pathfinding

      // Get the start of the path
      String startString = scan.next();
      // Refer to the hastable to get its number
      int startInt = nameToNumber.get(startString);

      // Get the end of the path
      String endString = scan.next();
      // Refer to the hashtalbe to get its number
      int endInt = nameToNumber.get(endString);

      //Startup the BellmanFord algorithm
      int[] ans = BellmanFord(edges,nameToNumber.size(), startInt, endInt);

      // This checks if hte path is negative
      // If it is, then print out the message
      if (ans[endInt] <0)
        System.out.println("Take as long as you need.");
      // Otherwise, print the cost of the path
      else 
        System.out.println(ans[endInt]);
    } 
  }

  // Now for the meat of the matter,
  // The finding the shortest route
  static int[] BellmanFord(List map, int vertices, int source, int endpoint) {
    // Commence some variables
    // V is the number of vertices
    // E is the number of edges
    int V = vertices, E = map.size();

    // dist[]:
    // Store distance from source to all vertices
    int dist[] = new int[V+1];

    // This fills it with "Infinite"
    // This is so we have a fallback and say that
    // the value is not known
    Arrays.fill(dist,Integer.MAX_VALUE);

    // The the distance to the source to 0
    dist[source]=0;

    for (int i=0;i<V;++i){ // Repeat for every vertice
      for (Object ed: map){ // Repeats for every edge
        Integer[] edge = (Integer[]) ed; // Start the edge as a list of Integer (trouble happens when not done this way)
        int u = edge[0]; // The source of the edge
        int v = edge[1]; // The end of the edge
        int cost = edge[2]; // The cost of the edge

        // Basically, if we have a value for the distance, then use it
        if (dist[u] != Integer.MAX_VALUE && dist[u] + cost < dist[v]){

          // This checks if the loop repeats too many times
          // Breaks the loop if so
          if (i== V-1)
            return new int[]{-1};
          
          // Sets the distance to the addition,
          // Keps track of distance
          dist[v]= dist[u] + cost;
        }
      }
    } 
    return dist; // So that we can use it in the main function
  }
}
