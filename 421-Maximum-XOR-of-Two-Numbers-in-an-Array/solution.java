class Node{
    Node links[] = new Node[2];
    boolean containsKey(int bit) {
        return (links[bit] != null); 
    }
    Node get(int bit) {
        return links[bit]; 
    }
    void put(int bit, Node node) {
        links[bit] = node; 
    }
}
public class Trie {
    private static Node root; 
    Trie() {
        root = new Node(); 
    }
    public static void insert(int num) {
        Node node = root;
        for(int i = 31;i>=0;i--) {
            int bit=(num>>i)&1;
            if(!node.containsKey(bit)) {
                node.put(bit, new Node()); 
            }
            node = node.get(bit); 
        }
    }
    public static int getMax(int num){
         Node node = root;
         int maxi=0;
        for(int i = 31;i>=0;i--) {
            int bit=(num>>i)&1;
            if(node.containsKey(1-bit) ){
                maxi=maxi|(1<<i);
                node=node.get(1-bit); 
            }
            else{
            node = node.get(bit); 
            }
        }
        return maxi;
    }
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        int n=nums.length;
        Trie trie=new Trie();
        int maxi=0;
        for(int i=0;i<n;i++){
            trie.insert(nums[i]);
        }
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,trie.getMax(nums[i]));
        }
        return maxi;
    }
}
