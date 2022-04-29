class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        boolean[] visited=new boolean[n];
        boolean result=hasPath(graph,source,destination,visited);
        return result;
    }
    private boolean hasPath(ArrayList<Integer>[] graph,int src,int dest,boolean[] visited){
        if(src==dest)
            return true;
        visited[src]=true;
        for(int nbr:graph[src])
        {
            if(visited[nbr]==false)
            {
                boolean hasNbrPath=hasPath(graph,nbr,dest,visited);
                if(hasNbrPath)
                    return true;
            }
        }
        return false;
    }
}





    