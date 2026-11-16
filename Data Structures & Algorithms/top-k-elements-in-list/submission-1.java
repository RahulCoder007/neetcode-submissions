class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> ct=new HashMap<>();
        for(int num : nums){
            ct.put(num,ct.getOrDefault(num,0)+1);
        }
        List<int[]> list= new ArrayList<>();
        for(int key:ct.keySet()){
            list.add(new int[]{ct.get(key),key});
        }
        list.sort((a,b)->b[0]-a[0]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)[1];
        }
        return res;












        // Map<Integer,Integer> ct=new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //    int v= ct.getOrDefault(nums[i],0)+1;

        //    ct.put(nums[i],v);

        // }
        // System.out.println(ct.entrySet());
        // System.out.println(ct);
        // Queue<Integer> minHeap=new PriorityQueue<>((a,b)->ct.get(a)-ct.get(b));

        // for(int key:ct.keySet()){
        //     minHeap.add(key);
        //     if(minHeap.size()>k)
        //     minHeap.poll();
        // }
        // int result[] =new int[k];
        // for(int i=0;i<k;i++){
        //     result[i]=minHeap.poll();
        // }
        // return result;
    }
}
