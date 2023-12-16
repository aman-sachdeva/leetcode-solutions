class Solution {
    public int largestRectangleArea(int[] heights) {
       int n=heights.length;
        int[] leftsmall=new int[n];
        int[] rightsmall=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!st.empty() && heights[st.peek()]>=heights[i]) {
                st.pop();
            }
            if(st.empty()){
              leftsmall[i]=0;
                st.push(i);
            }else{
                leftsmall[i]=st.peek()+1;
                st.push(i);
            }
        }
        while(!st.empty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
           while(!st.empty() && heights[st.peek()]>=heights[i]){
                st.pop();
            } 
            if(st.empty()){
                rightsmall[i]=n-1;
                st.push(i);
            }else{
                rightsmall[i]=st.peek()-1;
                st.push(i);
            }
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            maxarea=Math.max(maxarea,heights[i]*(rightsmall[i]-leftsmall[i]+1));
        }
        return maxarea;
    }
}