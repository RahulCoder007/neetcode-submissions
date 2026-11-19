class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    /******O(nlogn)************/

        // Map<Integer,Integer> ct=new HashMap<>();
        // for(int num : nums){
        //     ct.put(num,ct.getOrDefault(num,0)+1);
            
        // }
        // System.out.println(ct);
        // List<int[]> list= new ArrayList<>();
        // for(int key:ct.keySet()){
        //      System.out.println(key);
        //     list.add(new int[]{ct.get(key),key});
        //     System.out.println(Arrays.deepToString(list.toArray()));
        // }
        // list.sort((a,b)->b[0]-a[0]);
        // System.out.println(Arrays.deepToString(list.toArray()));
        // int[] res=new int[k];
        // for(int i=0;i<k;i++){
        //     res[i]=list.get(i)[1];
        // }
        // return res;











        /******O(klogn)************/
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

    /******O(n)************/

    Map<Integer,Integer> ct=new HashMap<>();

    for (int num : nums)
    ct.put(num,ct.getOrDefault(num,0)+1);

    List<Integer>[] bkt= new List[nums.length+1];
    
    for(int key: ct.keySet()){
       if(bkt[ct.get(key)]==null)
       bkt[ct.get(key)]=new ArrayList<>();
       bkt[ct.get(key)].add(key);
    }

    int[] res=new int[k];
    int idx=0;
    for(int j=bkt.length-1;j>=0 && idx<k;j--){
        if(bkt[j]!=null){
            for(int val:bkt[j]){
                res[idx++]=val;
                if(idx==k)
                return res;
            }
        }
       
    }
    return new int[]{};
   }
}




