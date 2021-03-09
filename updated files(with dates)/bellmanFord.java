package ada_2021;

class bellmanFord {
	
		// 19csu247 
		// date created : 8 march 
	
	
			class CreateEdge {
		 int s, d, w;
		
		 CreateEdge() {
		   s = d = w = 0;
		 }
		};

		int V, E;
		CreateEdge edge[];
		
		// Creates graph-> V vertices and E edges
		bellmanFord(int v, int e) {
		 V = v;
		 E = e;
		 edge = new CreateEdge[e];
		 for (int i = 0; i < e; ++i)
		   edge[i] = new CreateEdge();
		}

		void BellmanFord(bellmanFord graph, int s) {
		 int V = graph.V, E = graph.E;
		 int dist[] = new int[V];
		
		 
		 for (int i = 0; i < V; ++i)
		   dist[i] = Integer.MAX_VALUE;
		
		
		 dist[s] = 0;
		
		
		 for (int i = 1; i < V; ++i) {
		   for (int j = 0; j < E; ++j) {
		     
		     int u = graph.edge[j].s;
		     int v = graph.edge[j].d;
		     int w = graph.edge[j].w;
		     if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v])
		       dist[v] = dist[u] + w;
		   }
		 }
		
		
		 for (int j = 0; j < E; ++j) {
		   int u = graph.edge[j].s;
		   int v = graph.edge[j].d;
		   int w = graph.edge[j].w;
		   if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
		     System.out.println("bellmanFord contains negative w cycle");
		     return;
		   }
		 }
		
		 
		 printSolution(dist, V);
		}

		
		void printSolution(int dist[], int V) {
		 System.out.println("Vertex \t\tDistance from Source");
		 for (int i = 0; i < V; ++i)
		   System.out.println(i + "\t\t" + dist[i]);
		}

		public static void main(String[] args) {
		 int V = 5;
		 int E = 8; 
		
		 bellmanFord graph = new bellmanFord(V, E);
		
		
		 graph.edge[0].s = 0;
		 graph.edge[0].d = 1;
		 graph.edge[0].w = 3;
		
		
		 graph.edge[1].s = 0;
		 graph.edge[1].d = 4;
		 graph.edge[1].w = 5;
		
		
		 graph.edge[2].s = 1;
		 graph.edge[2].d = 2;
		 graph.edge[2].w = 8;
		
		 
		 graph.edge[2].s = 1;
		 graph.edge[2].d = 4;
		 graph.edge[2].w = 3;
		
		 
		 graph.edge[4].s = 3;
		 graph.edge[4].d = 2;
		 graph.edge[4].w = 2;
		 
		 graph.edge[2].s = 4;
		 graph.edge[2].d = 3;
		 graph.edge[2].w = 4;
		
		
		 graph.BellmanFord(graph, 0);
		 
		 
		}
		
		/* output :
		 
		 Vertex 		Distance from Source
				0		0
				1		3
				2		11
				3		9
				4		5
		 
		 
		 
		
		 */
		
		
		
		
		
}


