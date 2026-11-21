class Solution {
    public int longestConsecutive(int[] nums) {
       
        if(nums.length==0) return 0;
         /******O(nlogn)*******/
        // Set<Integer> set=new TreeSet<>();
        // for(int num: nums)
        // set.add(num); //{1, 2, 10, 11, 12} O(nlogn)

        // int ct=1;
        // int maxCt=1;
        // Integer prev=null;
        // for(int num: set){
        //     if(prev!=null){
        //        if(prev+1==num){
        //         ct++;
        //         maxCt=Math.max(ct,maxCt);
        //        }else{
        //         ct=1;
        //        } 
              
        //     }
        //      prev=num;
        // }
        // return maxCt;

    /******O(n)*******/
    Set<Integer> set =new HashSet<>();

    for(var num : nums)
    set.add(num);
    int maxCt=0;
    for(var num: set){
        

        if(!set.contains(num-1)){
            int currNum=num;
            int ct=1;
            
            while(set.contains(currNum+1)){
                currNum++;
                ct++;
            }
            maxCt=Math.max(ct,maxCt);


        }
    }
    return maxCt;
        
    }
}
