class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        PriorityQueue<int[]> x = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
    for (int[] i : points) {
        x.offer(i);
        if (x.size() > K) {
            x.poll();
        }
    }
    while (K > 0) {
        res[--K] = x.poll();
    }
    return res;
    }
}