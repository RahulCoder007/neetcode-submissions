class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> ct=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           int v= ct.getOrDefault(nums[i],0)+1;

           ct.put(nums[i],v);

        }
        Queue<Integer> minHeap=new PriorityQueue<>((a,b)->ct.get(a)-ct.get(b));

        for(int key:ct.keySet()){
            minHeap.add(key);
            if(minHeap.size()>k)
            minHeap.poll();
        }
        int result[] =new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll();
        }
        return result;
    }
}
