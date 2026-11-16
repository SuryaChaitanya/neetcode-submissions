class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        Arrays.stream(nums).forEach(num -> {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll();
        });
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
