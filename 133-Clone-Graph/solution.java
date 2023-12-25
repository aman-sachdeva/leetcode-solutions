class Solution {
    public void dfs (Node node,Node copy,Node[] visited){
        visited[copy.val]=copy;
        for(Node x:node.neighbors){
            if(visited[x.val]==null){
                Node newnode=new Node(x.val);
                copy.neighbors.add(newnode);
                dfs(x,newnode,visited);
            }
            else{
                copy.neighbors.add(visited[x.val]);
            }
        }
    }
    public Node cloneGraph(Node node) {
       if(node==null){
           return null;
       } 
       Node copy=new Node(node.val);
       Node[] visited=new Node[101];
       Arrays.fill(visited,null);
       dfs(node,copy,visited);
       return copy;
    }
}